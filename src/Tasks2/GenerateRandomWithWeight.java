package Tasks2;

public class GenerateRandomWithWeight {
    private int[] values;
    private int[] weights;
    private int[] leftBorder;
    private int length;

    public GenerateRandomWithWeight(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;

        leftBorder = new int[values.length];
        length = 0;
        for (int i = 0; i < leftBorder.length; ++i) {
            leftBorder[i] = length;
            length += weights[i];
        }
//        for (int border : leftBorder) {
//            System.out.println(border);
//        }
//        System.out.println(length);
    }

    public int getRandom() {
        int randomNumber = (int) (Math.random() * (length));
        System.out.println("randomNumber = " + randomNumber);
        int index = 0;
        for (int i = 0; i < leftBorder.length; ++i) {
            if (leftBorder[i] > randomNumber) {
                break;
            }
            index = i;
        }
        return values[index];
    }

    public static void main(String[] args) {
        int[] values = new int[] {1, 2, 3};
        int[] weight = new int[] {1, 2, 10};

        GenerateRandomWithWeight generateRandomWithWeight = new GenerateRandomWithWeight(values, weight);
        System.out.println("value = " + generateRandomWithWeight.getRandom());
    }
}
