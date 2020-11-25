import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        graphics.setColor(Color.PINK);
        graphics.drawLine(20,20, 120,20);
        graphics.setColor(Color.PINK);
        graphics.drawLine(120,20,120,120);
        graphics.setColor(Color.PINK);
        graphics.drawLine(120,120,20,120);
        graphics.setColor(Color.PINK);
        graphics.drawLine(20,120,20,20);

        graphics.setColor(Color.BLUE);
        graphics.drawRect( 20,130, 25,25);

        graphics.setColor(Color.RED);
        graphics.fillRect(50, 130,25,25);

        graphics.setColor(Color.YELLOW);
        graphics.fill3DRect(80,130,25,25,true);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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