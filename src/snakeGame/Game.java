package snakeGame;

import graphics.GameScreen;

import javax.swing.*;

public class Game extends JFrame{

    public GameScreen gameScreen;


    private void createPlayingField() {
        gameScreen = new GameScreen();
        getContentPane().add(gameScreen);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        setLocationRelativeTo(null);

        setVisible(true);

    }


    public static void main(String[] args) {
        final Game snake64 = new Game();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                snake64.createPlayingField();
            }
        });
    }
}
