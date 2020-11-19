import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Please enter username:");
        Scanner myObj = new Scanner(System.in);
        String username;
        username = myObj.nextLine();
        System.out.println("Hello, " + username + "!");
    }
}