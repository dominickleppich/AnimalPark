package eu.nepster.animalpark.puzzle.creator;

/**
 * Created by nico on 6/29/17.
 */
public class PuzzleEditor {
    private int[][] color;
    private int parks;
    private int[][] used;
    private int size;
    public PuzzleEditor(int size, int parks){
        this.size = size;
        this.parks = parks;
        color = new int[size][size];
        used  = new int[size][size];
    }

    public int getSize(){
        return size;
    }

    public void setUsed(int x, int y){
        used[x][y] = 1;
    }
    public int[] getBoard(){
        int[] board = new int[size*size];
        return board;
    }
}
