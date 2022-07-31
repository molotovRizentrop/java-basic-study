package dev.kashtan.java.basic.section10_practics;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class FizzBuzzMy {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
