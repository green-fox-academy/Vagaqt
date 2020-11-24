public class ToDoPrint {
    public static void main(String[] args) {
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String todoText = " - Buy milk\n";
        String download = " - Download games\n";
        todoText = todoText.concat(download);
        String diablo = " - Diablo";
        int indent;
        indent = 4;
        todoText = todoText.concat(diablo.indent(indent));

        System.out.println(todoText);
    }
}
