package eu.nepster.animalpark;

import eu.nepster.animalpark.io.Java2DGraphic;
import eu.nepster.animalpark.puzzle.MyPuzzle;
import eu.nepster.animalpark.puzzle.Puzzle;

/**
 * @author Dominick Leppich
 */
public class Boot {
    public static void main(String[] args) {
        int[] lvl1 = new int[] {0, 1, 1, 1, 1,
                                0, 0, 1, 1, 1,
                                0, 2, 3, 1, 1,
                                0, 3, 3, 3, 4,
                                3, 3, 3, 4, 4};

        Puzzle p = new MyPuzzle(lvl1, 1);
        Java2DGraphic g = new Java2DGraphic(p);
    }
}
