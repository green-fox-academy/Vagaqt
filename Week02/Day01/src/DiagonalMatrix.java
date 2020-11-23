import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically*) a two dimensional array
        //   with the following matrix**. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // * length should depend on a variable
        // ** Relax, a matrix is just like an array
        int[][] a = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //int c = 4;
        //int[] array1 = {1, 0, 0, 0};
        //int[] array2 = {0, 1, 0, 0};
        //int[] array3 = {0, 0, 1, 0};
        //int[] array4 = {0, 0, 0, 1};
        //int[][] d= {
        //        array1, array2, array3, array4

        int c = 6;
        int[][] b= new int[c][c];

        for (int rowNumber = 0; rowNumber < c; rowNumber++) {
            for (int columnNumber = 0; columnNumber < c; columnNumber++) {
                if (rowNumber==columnNumber) {
                    System.out.print("1 ");

//                     b[rowNumber][columnNumber]=1;
//
//                    for (int i = 0; i < c; i++) {
//                        for (int j = 0; j < c; j++) {
//                            System.out.print(b[i][j]);
//                        }
//                        System.out.println();}
//
                }else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}


