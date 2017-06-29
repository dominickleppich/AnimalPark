package eu.nepster.animalpark.test;

import eu.nepster.animalpark.puzzle.Puzzle;

import java.util.Random;

/**
 * Created by dominick on 6/29/17.
 */
public class DummyPuzzle extends Puzzle {
    private Random rnd;
    private int size;

    public DummyPuzzle() {
        rnd = new Random(System.currentTimeMillis());
        size = rnd.nextInt(16) + 4;
    }

    @Override
    public void setMark(int x, int y, boolean mark) {
        System.out.println("Set mark at x=" + x + ", y=" + y + " to " + mark);
    }

    @Override
    public boolean isMark(int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getColor(int x, int y) {
        return rnd.nextInt(6);
    }

    @Override
    public int getSize() {
        return size;
    }
}
