package eu.nepster.animalpark;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import eu.nepster.animalpark.io.Java2DGraphic;
import eu.nepster.animalpark.puzzle.MyPuzzle;
import eu.nepster.animalpark.puzzle.Puzzle;

public class Boot extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;

    @Override
    public void create () {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");

        /**int[] lvl1 = new int[] {0, 1, 1, 1, 1,
                0, 0, 1, 1, 1,
                0, 2, 3, 1, 1,
                0, 3, 3, 3, 4,
                3, 3, 3, 4, 4};

        Puzzle p = new MyPuzzle(lvl1, 1);
        Java2DGraphic g = new Java2DGraphic(p);*/
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        img.dispose();
    }
}