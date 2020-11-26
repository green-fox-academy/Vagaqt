import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        Random random = new Random();
        int starCount = 200;

        for (int i = 0; i < starCount; i++) {

            int starX = random.nextInt(WIDTH);
            int starY = random.nextInt(WIDTH);
            int colourGrey = random.nextInt(128) + 128;
            Color randomGrey = new Color(colourGrey, colourGrey, colourGrey);
            int starSize = random.nextInt(5) + 2;
            graphics.fillRect(starX, starY, starSize, starSize);
            graphics.setColor(randomGrey);

        }


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = WIDTH;

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
            setBackground(Color.black);
        }
    }
}