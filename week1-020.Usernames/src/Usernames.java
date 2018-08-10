
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String u = reader.nextLine();
        System.out.println("Type your password: ");
        String p = reader.nextLine();
        Boolean accepted = ((u.equals("alex") && p.equals("mightyducks")) || (u.equals("emily") && p.equals("cat")));
        if (accepted) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }

    }
}
