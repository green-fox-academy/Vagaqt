import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    static int WIDTH = 320;
    static int HEIGHT = WIDTH;

    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        Random random = new Random();
        int w = 0;
        int h = 0;
        for (int i = 0; i <= WIDTH / 20; i++) {
            drawLineToMiddleRGB(w, h, graphics, random);
            w = w + 20;
        }
        w = 0;
        h = WIDTH;
        for (int i = 0; i <= WIDTH / 20; i++) {
            drawLineToMiddleRGB(w, h, graphics, random);
            w = w + 20;
        }
        w = 0;
        h = 0;
        for (int i = 0; i <= WIDTH / 20; i++) {
            drawLineToMiddleRGB(w, h, graphics, random);
            h = h + 20;
        }
        h = 0;
        w = WIDTH;
        for (int i = 0; i <= WIDTH / 20; i++) {
            drawLineToMiddleRGB(w, h, graphics, random);
            h = h + 20;
        }
    }


    private static void drawLineToMiddleRGB(int w, int h, Graphics graphics, Random random) {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        graphics.setColor(randomColor);
        graphics.drawLine(w, h, WIDTH / 2, HEIGHT / 2);
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