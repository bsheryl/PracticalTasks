package Recursion;

import java.util.Arrays;

public class BinarySearch {

    public static double[] generateArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = Math.random();
        }
        return array;
    }

    public static boolean enumerationSearch(double[] array, double key) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(double[] array, double key) {
        return binarySearch(array, key, 0, array.length);
    }

    public static boolean binarySearch(double[] array, double key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low)
            return false;
        if (key == array[middle]) {
            return true;
        } else if (key < array[middle]) {
            return binarySearch(array, key, low, middle - 1);
        } else {
            return binarySearch(array, key, middle + 1, high);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        double[] array = generateArray(n);
        Arrays.sort(array);
        double key = array[(int) (Math.random() * (n - 1))];
//        double key = -1;
        System.out.println("key = " + key);
        long time = System.currentTimeMillis();
        System.out.println("enumeration:" + enumerationSearch(array, key));
        System.out.println("time with enumeration: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println("binary: " + binarySearch(array, key));
        System.out.println("time with binary: " + (System.currentTimeMillis() - time));
    }
}
