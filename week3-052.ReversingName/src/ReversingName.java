import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = name.length();
        while (i>0) {
            System.out.print(name.charAt(i-1));
            i--;
        }        
    }
}
