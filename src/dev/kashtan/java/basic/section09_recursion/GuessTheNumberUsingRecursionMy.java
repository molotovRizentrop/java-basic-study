package dev.kashtan.java.basic.section09_recursion;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class GuessTheNumberUsingRecursionMy {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

        guessTheNumberRecoursive(number);
    }

    private static void guessTheNumberRecoursive(int number) {
        var userCase = new Scanner(System.in).nextInt();

        if (number == userCase) {
            System.out.println("Congratulations, you guessed the number!");// display results

        } else {
            System.out.println(number < userCase ? "number < " + userCase + ". Try again:"
                    : "number > " + userCase + ". Try again:");
            guessTheNumberRecoursive(number);

        }
    }
}
