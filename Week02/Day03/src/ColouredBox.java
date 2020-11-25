
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColouredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(Color.PINK);
        graphics.drawLine(20,20, 120,20);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(120,20,120,120);
        graphics.setColor(Color.green);
        graphics.drawLine(120,120,20,120);
        graphics.setColor(Color.orange);
        graphics.drawLine(20,120,20,20);

}


// Don't touch the code below
static int WIDTH = 400;
static int HEIGHT = 400;

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
        this.setBackground(Color.WHITE);
        mainDraw(graphics);
    }
}
}