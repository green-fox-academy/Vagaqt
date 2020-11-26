import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}, {10, 10}};
        int[][] these = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};

        int[] boxX = new int[box.length];
        int[] boxY = new int[box.length];
        for (int i = 0; i < box.length; i++) {
            boxX[i] = box[i][0];
            boxY[i] = box[i][1];
        }
        graphics.setColor(Color.black);
        graphics.drawPolyline(boxX, boxY, box.length);


        int[] theseX = new int[these.length];
        int[] theseY = new int[these.length];
        for (int i = 0; i < these.length; i++) {
            theseX[i] = these[i][0];
            theseY[i] = these[i][1];
        }
        graphics.setColor(Color.GREEN);
        graphics.drawPolyline(theseX, theseY, these.length);
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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