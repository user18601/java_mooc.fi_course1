import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        System.out.println("Type numbers:");
        int number = Integer.parseInt(reader.nextLine());
        while (number != -1) {
            all.addNumber(number);
            if (number%2==0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("sum: " + all.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
