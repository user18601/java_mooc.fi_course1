
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        System.out.println("Type the password: ");
        String guess = reader.nextLine();  
        while (!guess.equals(password)) {
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            guess = reader.nextLine();           
        }
        System.out.println("Right!\n\nThe secret is: jryy qbar!");

        // Write your code here
    }
}
