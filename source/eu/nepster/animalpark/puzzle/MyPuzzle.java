package eu.nepster.animalpark.puzzle;

import java.util.Observable;

import static java.lang.Math.sqrt;

public class MyPuzzle extends Observable implements Puzzle{
    private Field [][] fields;
    private int[] color;
    private int size;

    public MyPuzzle(int[] board, int parks){
        size = (int) sqrt(board.length);
        color = new int[size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                fields[i][j].setColor(board[(i*size) + j]);
            }
        }
    }

    @Override
    public void setMark(int x, int y){
    }

    @Override
    public boolean isMark(int x, int y){
    }

    @Override
    public int getColor(int x, int y){
        return fields[x][y].getColor();
    }

    @Override
    public int getSize(){
        return size;
    }
}
