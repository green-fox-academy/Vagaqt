import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


class RainbowBoxFunctionDemo {
    static int WIDTH = 400;
    static int HEIGHT = WIDTH;

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        // FINAL CODE
        //        Random random = new Random();
        //        int lineWidth = 50;
        //        int squareSize = WIDTH;
        //        int squares = WIDTH/lineWidth;
        //        for (int i = 0; i < squares; i++) {
        //            fillSquareRGB(squareSize, random, graphics);
        //            squareSize = squareSize - lineWidth;

//            Friday's demo

        //static width/height change

        //rgb random colour generator
//        Random random = new Random();
//        int red = random.nextInt(256);
//        int green = random.nextInt(256);
//        int blue = random.nextInt(256);
//        Color randomColor = new Color(red, green, blue);
//        graphics.setColor(randomColor);


        //10x10 inside out

//        graphics.fillRect(WIDTH / 2 - 5, HEIGHT / 2 - 5, 10, 10);

        // for i loop x5
//        int squareSize = 10;
//        for (int i = 0; i < 5; i++) {
//            graphics.fillRect(WIDTH / 2 - squareSize/2, HEIGHT / 2 - squareSize/2, squareSize, squareSize);
//            squareSize = squareSize + 10;
//        }

//         creating function for fillSquareRGB
//        private static void fillSquareRGB ( int squareSize, Random random, Graphics graphics){
//            int red = random.nextInt(256);
//            int green = random.nextInt(256);
//            int blue = random.nextInt(256);
//            Color randomColor = new Color(red, green, blue);
//            graphics.setColor(randomColor);
//            graphics.fillRect(HEIGHT / 2 - (squareSize / 2), WIDTH / 2 - (squareSize / 2), squareSize, squareSize);
//        }

        //starting from the edges, importance of WIDTH/HEIGHT in the code

//        Random random = new Random();
//        int squareSize = WIDTH;
//        int squares = WIDTH / 10;
//        for (int i = 0; i < squares; i++) {
//            fillSquareRGB(squareSize, random, graphics);
//            squareSize = squareSize - 10;
//        }
        //experiment with squares/ linewidth

        // introducing linewidth, final code
//        Random random = new Random();
//        int lineWidth = 10;
//        int squareSize = WIDTH;
//        int squares = WIDTH / lineWidth;
//        for (int i = 0; i < squares; i++) {
//            fillSquareRGB(squareSize, random, graphics);
//            squareSize = squareSize - lineWidth;
//        }


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
