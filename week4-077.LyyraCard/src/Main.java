
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard p = new LyyraCard(20);
        LyyraCard b = new LyyraCard(30);
        p.payGourmet();
        b.payEconomical();
        System.out.println("Pekka: " + p);
        System.out.println("Brian: " + b);
        p.loadMoney(20);
        b.payGourmet();        
        System.out.println("Pekka: " + p);
        System.out.println("Brian: " + b);
        p.payEconomical();
        p.payEconomical();
        b.loadMoney(50);        
        System.out.println("Pekka: " + p);
        System.out.println("Brian: " + b);
        
        

    }
}
