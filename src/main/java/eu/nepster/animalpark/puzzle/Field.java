package eu.nepster.animalpark.puzzle;

/**
 * Created by nico on 6/29/17.
 */
public class Field {
    private int color;
    private boolean mark;

    public Field(int c){
        color = c;
    }

    public void setColor(int c){
        color = c;
    }

    public int getColor(){
        return color;
    }

    public boolean isMark(){
        return mark;
    }

    public void setMark(boolean m){
        mark = m;
    }
}
