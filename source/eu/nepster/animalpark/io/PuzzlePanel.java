package eu.nepster.animalpark.io;

import eu.nepster.animalpark.puzzle.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by dominick on 6/29/17.
 */
public class PuzzlePanel extends JPanel implements MouseListener {
    private static final int FIELD_SIZE = 50;
    private static final Color[] COLORS = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.GRAY, Color.PINK, Color.ORANGE};

    private Puzzle puzzle;

    public PuzzlePanel(Puzzle puzzle) {
        this.puzzle = puzzle;
        setPreferredSize(new Dimension(FIELD_SIZE * puzzle.getSize(), FIELD_SIZE * puzzle.getSize()));

        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics gg) {
        Graphics2D g = (Graphics2D) gg;

//        g.setColor(Color.BLACK);
//        g.fillRect(0, 0, getWidth(), getHeight());

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setStroke(new BasicStroke(1f));

        int mark = 0;

        for (int x = 0; x < puzzle.getSize(); x++) {
            for (int y = 0; y < puzzle.getSize(); y++) {
                g.setColor(COLORS[puzzle.getColor(x, y)]);
                g.fillRect(x * FIELD_SIZE, y * FIELD_SIZE, FIELD_SIZE, FIELD_SIZE);
                // TODO Draw mark


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
        System.out.println("Clicked " + mouseEvent.getX() + ", " + mouseEvent.getY());

        puzzle.setMark(mouseEvent.getX() / FIELD_SIZE, mouseEvent.getY() / FIELD_SIZE, true);
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
