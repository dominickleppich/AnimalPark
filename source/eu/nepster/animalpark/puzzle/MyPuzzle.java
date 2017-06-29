package eu.nepster.animalpark.puzzle;

import java.util.Observable;

import static java.lang.Math.signum;
import static java.lang.Math.sqrt;

public class MyPuzzle extends Puzzle{
    private Field [][] fields;
    private int size;
    private int parks;

    public MyPuzzle(int[] board, int p){
        parks = p;
        size = (int) sqrt(board.length);
        fields = new Field[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                fields[i][j] = new Field(board[(j*size) + i]);
            }
        }
    }

    @Override
    public void setMark(int x, int y, boolean mark){
        fields[x][y].setMark(mark);
        setChanged();
        notifyObservers(isWin());
    }

    @Override
    public boolean isMark(int x, int y){
        return fields[x][y].isMark();
    }

    @Override
    public int getColor(int x, int y){
        return fields[x][y].getColor();
    }

    @Override
    public int getSize(){
        return size;
    }

    private boolean isWin(){
        int[] color = new int[size];
        int[] cols = new int[size];
        int[] rows = new int[size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j< size; j++){
                if(!fields[i][j].isMark())
                    continue;
                if(checkNeighbor(i,j))
                    return false;
                cols[i]++;
                rows[j]++;
                color[fields[i][j].getColor()]++;
            }
        }
        for(int i = 0; i < size; i++){
            if(cols[i] != parks || rows[i] != parks || color[i] != parks)
                return false;
        }
        return true;
    }

    private boolean checkNeighbor(int x, int y){
        for( int i = -1; i <= 1; ++i ) {
            for( int j = -1; j <= 1; ++j ) {
                if(i == 0 && j == 0)
                    continue;
                if( i + x >= 0 && i + x < size &&
                        j + y >= 0 && j + y < size) {
                    if(fields[i+x][j+y].isMark())
                        return true;
                }
            }
        }
        return false;
    }
}
