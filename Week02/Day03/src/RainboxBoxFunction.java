import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


class RainbowBoxFunction {
    static int WIDTH = 600;
    static int HEIGHT = WIDTH;

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        Random random = new Random();
        int lineWidth = 50;
        int squareSize = WIDTH;
        int squares = WIDTH/lineWidth;
        for (int i = 0; i < squares; i++) {
            fillSquareRGB(squareSize, random, graphics);
            squareSize = squareSize - lineWidth;
        }

    }

    private static void fillSquareRGB(int squareSize, Random random, Graphics graphics) {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        graphics.setColor(randomColor);
        graphics.fillRect(HEIGHT / 2 - (squareSize / 2), WIDTH / 2 - (squareSize / 2), squareSize, squareSize);
    }

    // Don't touch the code below


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
