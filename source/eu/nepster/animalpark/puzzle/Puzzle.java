package eu.nepster.animalpark.puzzle;

import java.util.Observable;

/**
 * Created by nico on 6/29/17.
 */
public abstract class Puzzle extends Observable{
    public abstract void setMark(int x, int y, boolean mark);

    public abstract boolean isMark(int x, int y);

    public abstract int getColor(int x, int y);

    public abstract int getSize();
}
