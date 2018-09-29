
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            for (int j : array) {
                smallest = Math.min(smallest, Math.min(i, j));
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = -1;
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int[] truncated = new int[array.length - index];
        for (int i = index; i < array.length; i++) {
            truncated[i - index] = array[i];
        }
        return index + indexOfTheSmallest(truncated);

    }

    public static void swap(int[] array, int index1, int index2) {
        int val1 = array[index1];
        array[index1] = array[index2];
        array[index2] = val1;
    }

    public static void sort(int[] array) {
        int smallestIndex = indexOfTheSmallest(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, smallestIndex);
            if (i + 1 != array.length) {
                smallestIndex = indexOfTheSmallestStartingFrom(array, i + 1);
            }
        }
    }

}
