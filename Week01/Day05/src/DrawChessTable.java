public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        int a = 8;
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++) {
                if (0 == (i + j) % 2) {
                    System.out.print("%");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
