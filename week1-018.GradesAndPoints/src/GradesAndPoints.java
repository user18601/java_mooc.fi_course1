
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int a = Integer.parseInt(reader.nextLine());
        if (a < 30) {
            System.out.println("Grade: failed");
        } else if (a < 35) {
            System.out.println("Grade: 1");
        } else if (a < 40) {
            System.out.println("Grade: 2");
        } else if (a < 45) {
            System.out.println("Grade: 3");
        } else if (a < 50) {
            System.out.println("Grade: 4");
        } else if (a <= 60) {
            System.out.println("Grade: 5");
        }

    }
}
