import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int in = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        while (in != -1) {
            count++;
            if (in%2 == 0) {
                evenCount++;
            }
            sum += in;
            in = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (double)sum/count);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + (count-evenCount));

    }
}
