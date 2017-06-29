package eu.nepster.animalpark.puzzle.creator;

import eu.nepster.animalpark.puzzle.Puzzle;

/**
 * Created by nico on 6/29/17.
 */
public class PuzzleGenerator {
    public int[] getPuzzle(int size, int parks){
        PuzzleEditor editor = new PuzzleEditor(size, parks);
        selectMark(editor);
        return editor.getBoard();
    }
    private void selectMark(PuzzleEditor editor){

    }
    private void setUsed(int x, int y, PuzzleEditor editor){
        //TO DO linien
        for( int i = -1; i <= 1; ++i ) {
            for( int j = -1; j <= 1; ++j ) {
                if( i + x >= 0 && i + x < editor.getSize() &&
                        j + y >= 0 && j + y < editor.getSize()) {
                    editor.setUsed(i+x,j+y);
                }
            }
        }
    }
}
