package Recursion;

public class RootOfEquation {
    public static double function(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static double findRoot(double begin, double end) {
        if (end - begin <= 0.001) {
            return begin;
        }

        double x = begin + (end - begin) / 2;

        if (x == end || x == begin) {
            return x;
        } else if (function(begin) * function(x) > 0) {
            return findRoot(x, end);
        } else {
            return findRoot(begin, x);
        }
    }

    public static void main(String[] args) {
        System.out.println(findRoot(0, 10));
    }
}
