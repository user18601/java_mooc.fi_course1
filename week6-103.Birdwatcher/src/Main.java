
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner s = new Scanner(System.in);
        Database db = new Database();
        InputHelper ih = new InputHelper(s, db);
        System.out.print("? ");
        String input = s.nextLine();
        while (!input.equals("Quit")) {
            if (input.equals("Add")) {
                ih.add();
            } else if (input.equals("Observation")) {
                ih.observation();
            } else if (input.equals("Statistics")) {
                ih.statistics();
            } else if (input.equals("Show")) {
                ih.show();
            } else {
                System.out.println("Invalid input.");
            }
            System.out.print("? ");
            input = s.nextLine();
        }
    }
}
