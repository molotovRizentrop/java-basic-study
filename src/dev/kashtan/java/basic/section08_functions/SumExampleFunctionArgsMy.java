package dev.kashtan.java.basic.section08_functions;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class SumExampleFunctionArgsMy {
    public static void main(String[] args) {
        System.out.println(sumOf());
        System.out.println(sumOf(1, 3, 4, 5, 5, 62, 4));
        System.out.println(sumOf(1234, -342));
    }

    private static int sumOf(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
