import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

        Color purple = new Color(255, 0, 255);
        int squares = 5;
        int w = 10;
        int h = 10;
        int squaresize = 10;
        for (int i = 0; i < squares; i++) {
            graphics.setColor(purple);
            graphics.fillRect(w, h, squaresize, squaresize);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(w, h, squaresize, squaresize);
            w = w + squaresize;
            h = h + squaresize;
            squaresize=squaresize*2;

        }
    }
        // Don't touch the code below
        static int WIDTH = 600;
        static int HEIGHT = 600;

        public static void main (String[]args){
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
