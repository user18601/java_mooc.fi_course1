import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Grader g = new Grader();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");
        int input = lukija.nextInt();
        while (input!=-1) {
            int grade = g.getGrade(input);
            if (grade != -1) {
                grades.add(grade);
            }
            input = lukija.nextInt();
        }
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + g.generateStars(Collections.frequency(grades, i)));
        }
        System.out.println("Acceptance percentage: " + g.getAcceptance(grades, g));
    }
}
