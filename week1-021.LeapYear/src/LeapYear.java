
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        double year = Double.parseDouble(reader.nextLine());
        Boolean leapYear = year/4%1 == 0 && year/100%1 != 0 || year/400%1 == 0;
        if (leapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
