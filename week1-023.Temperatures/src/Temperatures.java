
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        //System.out.println("Input a number: ");
        double first = Double.parseDouble(reader.nextLine());
        if (first >= -30 && first <= 40) {
            Graph.addNumber(first);
            //System.out.println("Added to graph.");
        } else {
            //System.out.println("Not added to graph. Tempetatures are between -30 and 40 inclusive.");
        }        
        //System.out.println("Enter another number? (Y/N)");
        //Boolean another = reader.nextLine().toLowerCase().equals("y");
        while (true) {
            //System.out.println("Input a number: ");
            double additional = Double.parseDouble(reader.nextLine());
            if (additional >= -30 && additional <= 40) {
                Graph.addNumber(additional);
                //System.out.println("Added to graph.");
        } else {
                //System.out.println("Not added to graph. Tempetatures are between -30 and 40 inclusive.");
        } 
            //System.out.println("Enter another number? (Y/N)");
            //another = reader.nextLine().toLowerCase().equals("y");
        }

        // Graph is used as follows:
        
        // Remove or comment out these lines above before trying to run the tests.
    }
}
