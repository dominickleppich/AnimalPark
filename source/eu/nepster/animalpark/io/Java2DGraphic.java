package eu.nepster.animalpark.io;

import eu.nepster.animalpark.puzzle.Puzzle;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Dominick Leppich
 */
public class Java2DGraphic extends JFrame implements Observer {
    private Puzzle puzzle;
    private PuzzlePanel panel;

    public Java2DGraphic(Puzzle puzzle) {
        this.puzzle = puzzle;
        puzzle.addObserver(this);

        Java2DGraphic ME = this;

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                puzzle.deleteObserver(ME);
            }
        });

        panel = new PuzzlePanel(puzzle);
        add(panel);

        setResizable(false);
        pack();
        setVisible(true);
    }

    @Override
    public void update(Observable observable, Object o) {
        repaint();
    }
}
