import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    static int WIDTH = 480;
    static int HEIGHT = WIDTH;

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int fieldNumbers = 12; //fieldNumbers should always be an EVEN number
        int w = 0;
        int h = 0;
        for (int k = 0; k < fieldNumbers/2; k++) {
            for (int j = 0; j < fieldNumbers/2; j++) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(w, h, WIDTH / fieldNumbers, WIDTH / fieldNumbers);
                w = w + WIDTH / fieldNumbers;
                graphics.setColor(Color.WHITE);
                graphics.fillRect(w, h, WIDTH / fieldNumbers, WIDTH / fieldNumbers);
                w = w + WIDTH / fieldNumbers;
            }
            w = 0;
            h = h + WIDTH / fieldNumbers;
            for (int i = 0; i < fieldNumbers/2; i++) {
                graphics.setColor(Color.WHITE);
                graphics.fillRect(w, h, WIDTH / fieldNumbers, WIDTH / fieldNumbers);
                w = w + WIDTH / fieldNumbers;
                graphics.setColor(Color.BLACK);
                graphics.fillRect(w, h, WIDTH / fieldNumbers, WIDTH / fieldNumbers);
                w = w + WIDTH / fieldNumbers;

            }
            w = 0;
            h = h + WIDTH / fieldNumbers;


        }
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
