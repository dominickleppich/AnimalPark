package eu.nepster.animalpark.puzzle;

/**
 * Created by nico on 6/29/17.
 */
public interface Puzzle {
    public void setMark(int x, int y);

    public boolean isMark(int x, int y);

    public int getColor(int x, int y);

    public int getSize();
}
