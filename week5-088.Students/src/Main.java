
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        System.out.println("name: ");
        String name = reader.nextLine();
        while (!name.equals("")) {
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student student = new Student(name, studentNumber);
            list.add(student);
            System.out.println("name: ");
            name = reader.nextLine();
        }
        for (Student s : list) {
            System.out.println(s);
        }
        
        System.out.println("\nGive search term: ");
        String searched = reader.nextLine();
        System.out.println("Result: ");
        for (Student s : list) {
            if (s.getName().contains(searched)) {
                System.out.println(s);
            }
        }
        
    }
}
