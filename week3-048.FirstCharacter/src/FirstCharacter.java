import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        System.out.println("First character: " + reader.nextLine().charAt(0));
    
    }
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
