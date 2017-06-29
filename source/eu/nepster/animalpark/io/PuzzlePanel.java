package eu.nepster.animalpark.io;

import eu.nepster.animalpark.puzzle.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

/**
 * Created by dominick on 6/29/17.
 */
public class PuzzlePanel extends JPanel implements MouseListener {
    private static final int FIELD_SIZE = 50;
    private static final int STROKE = 2;
    private static final Color[] COLORS = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.GRAY, Color.PINK, Color.ORANGE};

    private Puzzle puzzle;

    public PuzzlePanel(Puzzle puzzle) {
        this.puzzle = puzzle;
        setPreferredSize(new Dimension(FIELD_SIZE * puzzle.getSize() + STROKE, FIELD_SIZE * puzzle.getSize() + STROKE));

        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics gg) {
        Graphics2D g = (Graphics2D) gg;

//        g.setColor(Color.BLACK);
//        g.fillRect(0, 0, getWidth(), getHeight());

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setStroke(new BasicStroke(STROKE));

        int mark = 0;

        for (int x = 0; x < puzzle.getSize(); x++) {
            for (int y = 0; y < puzzle.getSize(); y++) {
                g.setColor(COLORS[puzzle.getColor(x, y)]);
                g.fillRect(x * FIELD_SIZE, y * FIELD_SIZE, FIELD_SIZE, FIELD_SIZE);
                // TODO Draw mark
                if (puzzle.isMark(x, y)) {
                    g.setColor(Color.WHITE);
                    g.fill(new Ellipse2D.Float(x * FIELD_SIZE + 10, y * FIELD_SIZE + 10, FIELD_SIZE - 20, FIELD_SIZE - 20));
                }

                g.setColor(Color.BLACK);
                g.drawRect(x * FIELD_SIZE, y * FIELD_SIZE, FIELD_SIZE, FIELD_SIZE);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int x = mouseEvent.getX() / FIELD_SIZE;
        int y = mouseEvent.getY() / FIELD_SIZE;
        puzzle.setMark(x, y, !puzzle.isMark(x, y));
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
