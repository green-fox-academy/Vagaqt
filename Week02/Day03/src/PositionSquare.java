import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics) {
        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        int w = 0;
        int h = 0;
        int numberOfSquares = 9;
        for (int i = 0; i < numberOfSquares/3; i++) {
            w=w+50;
            h=h+50;
            drawSquareFifty(h, w, graphics);
            w =w+50;
            h = h+50;
            fillSquareFiftyBlack(h, w, graphics);
            w= w+50;
            h = h+50;
            fill3DRectYellow(h, w, graphics);}
    }

    private static void fill3DRectYellow(int h, int w, Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fill3DRect(w, h,50,50,true);
    }

    private static void fillSquareFiftyBlack(int h, int w, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(w, h, 50, 50);
    }

    private static void drawSquareFifty(int h, int w, Graphics graphics) {
        graphics.drawRect(w, h, 50, 50);
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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
