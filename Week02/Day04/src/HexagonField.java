import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonField {
    public static void mainDraw(Graphics graphics) {
        int layers = 15;
        //ALPHA POINT = WIDTH/2-n, HEiGHT/2
        int[] x = new int[6];
        int[] y = new int[6];
        int alphaX;
        int alphaY;
        int colourChange = 16;
        int red = 255;
        int green = 255;
        int blue = 255;
        graphics.setColor(Color.WHITE);
        alphaX = 240;
        alphaY = 280;
        for (int j = 0; j < layers; j++) {
            blue = blue - colourChange;
            graphics.setColor(new Color(red, green, blue));
            alphaY = alphaY + 18;
            setHexagon(graphics, alphaX, alphaY, x, y);
        }
        blue = 255;
        graphics.setColor(Color.WHITE);
        alphaX = 240;
        alphaY = 280;
        for (int j = 0; j < layers; j++) {
            green = green - colourChange / 2;
            red = red - colourChange / 2;
            graphics.setColor(new Color(red, green, blue));
            alphaY = alphaY - 18;
            setHexagon(graphics, alphaX, alphaY, x, y);
        }
        green = 255;
        red = 255;
        graphics.setColor(Color.WHITE);
        alphaX = 240;
        alphaY = 280;
        for (int j = 0; j < layers; j++) {
            green = green - colourChange / 2;
            blue = blue - colourChange / 2;
            graphics.setColor(new Color(red, green, blue));
            alphaY = alphaY + 9;
            alphaX = alphaX + 16;
            setHexagon(graphics, alphaX, alphaY, x, y);
        }
        green = 255;
        blue = 255;
        graphics.setColor(Color.WHITE);
        alphaX = 240;
        alphaY = 280;
        for (int j = 0; j < layers; j++) {
            red = red - colourChange;
            graphics.setColor(new Color(red, green, blue));
            alphaY = alphaY - 9;
            alphaX = alphaX - 16;
            setHexagon(graphics, alphaX, alphaY, x, y);
        }
        red = 255;
        graphics.setColor(Color.WHITE);
        alphaX = 240;
        alphaY = 280;
        for (int j = 0; j < layers; j++) {
            red = red - colourChange / 2;
            blue = blue - colourChange / 2;
            graphics.setColor(new Color(red, green, blue));
            alphaY = alphaY + 9;
            alphaX = alphaX - 16;
            setHexagon(graphics, alphaX, alphaY, x, y);
        }
        red = 255;
        blue = 255;
        graphics.setColor(Color.WHITE);
        alphaX = 240;
        alphaY = 280;
        for (int j = 0; j < layers; j++) {
            green = green - colourChange;
            graphics.setColor(new Color(red, green, blue));

            alphaY = alphaY - 9;
            alphaX = alphaX + 16;
            setHexagon(graphics, alphaX, alphaY, x, y);
        }
        green = 255;
    }

    private static void setHexagon(Graphics graphics, int alphaX, int alphaY, int[] x, int[] y) {
        for (int i = 0; i < 1; i++) {

            x[0] = alphaX;
            x[1] = alphaX + 5;
            x[2] = alphaX + 15;
            x[3] = alphaX + 20;
            x[4] = alphaX + 15;
            x[5] = alphaX + 5;

            y[0] = alphaY;
            y[1] = alphaY - 9;
            y[2] = alphaY - 9;
            y[3] = alphaY;
            y[4] = alphaY + 9;
            y[5] = alphaY + 9;
            graphics.fillPolygon(x, y, 6);
        }
    }


//        int[] x = {alphaX, alphaX + 5, alphaX + 15, alphaX + 20, alphaX + 15, alphaX + 5};
//        int[] y = {alphaY, alphaY - 9, alphaY - 9, alphaY, alphaY + 9, alphaY + 9};


//        for (int i = 0; i < layers; i++) {
//            for (int j = 0; j < y.length; j++) {
//                y[j] = y[j] - 18;
//            }
//            graphics.drawPolygon(x, y, 6);
//        }
//        alphaX = 240;
//        alphaY = 250;
//        for (int i = 0; i < layers; i++) {
//            for (int j = 0; j < y.length; j++) {
//                y[j] = y[j] +18 ;
//            }
//            graphics.drawPolygon(x, y, 6);
//        }


    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 560;

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