import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int target = Integer.parseInt(reader.nextLine());
        int fact = 1;
        int i = 2;
        while (i <= target) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial is " + fact);

    }
}
