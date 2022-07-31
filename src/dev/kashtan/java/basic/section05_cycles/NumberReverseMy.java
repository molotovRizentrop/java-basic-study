package dev.kashtan.java.basic.section05_cycles;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class NumberReverseMy {
    public static void main(String[] args) {
        int number = 297543;

        int result = 0;
        int tmp = number;

        while (tmp != 0) {
            result = result * 10 + tmp % 10;
            tmp /= 10;
        }
        System.out.println(number + " reverse = " + result);
    }
}
