package Tasks1;

import java.util.Arrays;

public class Task1_3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * n);
        }
        int removeElem = (int) (Math.random() * (n - 1));
        System.out.println("array[" + removeElem + "] = " + array[removeElem]);
        System.out.println("before: " + Arrays.toString(array));
        System.out.println(" after: " + Arrays.toString(removeElement(array, array[removeElem])));
    }

    public static int[] removeElement(int[] array, int removeVal) {
        int offset = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == removeVal) {
                ++offset;
            } else {
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }
}
