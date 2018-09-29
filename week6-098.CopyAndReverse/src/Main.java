
public class Main {

    public static int[] copy(int[] array) {
        return array.clone();
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];
        int al = array.length;
        for (int i = 0; i < al; i++) {
            reversed[i] = array[al-i-1];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + (original));
        System.out.println("reversed: " + reverse);
    }
}
