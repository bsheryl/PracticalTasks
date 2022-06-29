package Tasks1;

import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
