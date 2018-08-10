import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        if (list.isEmpty()) {
            throw new IllegalArgumentException("There can be no greatest integer in an empty list.");
        } else {
            int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            max = Math.max(list.get(i), max);
        }
        return max;
        }        
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
