package Tasks1;

public class Task1_0 {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[1];
        double avg = 0;
        for (int i = 0; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg += array[i];
        }
        avg /= array.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
