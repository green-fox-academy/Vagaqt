import java.util.Arrays;
import java.util.Scanner;

public class Colours {
    public static void main(String[] args) {
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        String[][] green = {{"lime"}, {"forest green"}, {"olive"}, {"pale green"}, {"spring green"}};
        String[][] red = {{"orange red"}, {"red"}, {"tomato"}};
        String[][] pink = {{"orchid"}, {"violet"}, {"pink"}, {"hot pink"}};
        System.out.println("Please pick a colour group: (1-3)");
        Scanner colourPicker = new Scanner(System.in);
        int colour = colourPicker.nextInt();
        int a = colour;
        if (a == 1) {
            for (int i = 0; i < green.length; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println(Arrays.deepToString(green) + " ");
                }
                System.out.println();
            }
        }
        if (a == 2) {
            for (int i = 0; i < red.length; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println(Arrays.deepToString(red) + " ");
                }
                System.out.println();
            }
        }
        if (a == 3) {
            for (int i = 0; i < pink.length; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println(Arrays.deepToString(pink) + " ");
                }
                System.out.println();
            }
        }
    }
}
