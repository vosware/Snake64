package graphics;

import snakeGame.Constants;
import utilities.FrameRate;

import java.awt.*;

/**
 * Created by Marco on 16-4-2016.
 */
public class GameScreen extends Canvas {

    private final int columns = Constants.WIDTH_TILES;
    private final int rows = Constants.HEIGHT_TILES;
    private final int tileSize = Constants.TILESIZE;
    private final int widthPixels = columns * tileSize;
    private final int heightPixels = rows * tileSize;
    private FrameRate frameRate;


    public GameScreen() {

        Dimension size = new Dimension(widthPixels, heightPixels);
        setPreferredSize(size);
        setBackground(Color.black);

        frameRate = new FrameRate();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        onPaint(g);
    }

    private void onPaint(Graphics g) {
        frameRate.calculate();
        g.setColor(Color.WHITE);
        g.drawString(frameRate.getFrameRate(),40,40);
        repaint();
    }
}
