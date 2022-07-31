package dev.kashtan.java.basic.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeMy {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        ticTacToe();
        System.out.println("GAME OVER");
    }

    private static void ticTacToe() {
        char[] field = initialFilling();
        whoseFirstMove(field);
        displayAction(field);

        while (true) {
            actionUser(field);
            displayAction(field);
            if (isWinOrDraw(field, 'x')) {
                break;
            }
            actionComputer(field);
            displayAction(field);
            if (isWinOrDraw(field, 'o')) {
                break;
            }
        }
    }

    private static void whoseFirstMove(char[] field) {
        System.out.println("Enter who move first.Enter 1 for player.Enter 2 for computer");

        boolean withinTheConfines = false;

        while (!withinTheConfines) {
            char symbol = new Scanner(System.in).nextLine().charAt(0);
            if (symbol == '1') {
                withinTheConfines = true;
            } else if (symbol == '2') {
                withinTheConfines = true;
                actionComputer(field);
            } else {
                System.out.println("Enter must be 1 or 2.Try again.");

            }
        }


    }

    private static void actionComputer(char[] field) {
        Random random = new Random();
        int value = 0;
        while (true) {
            value = random.nextInt(9) + 1;
            if (value >= 1 && value <= 9) {
                if (isCellIsEmpty(field[value - 1])) {
                    field[value - 1] = 'o';
                    return;
                }

            }
        }
    }

    private static char[] initialFilling() {
        char[] array = new char[9];
        Arrays.fill(array, ' ');
        return array;
    }

    private static void displayAction(char[] s) {
        System.out.println("-------------");


        System.out.println("-------------");
        System.out.println("| " + s[6] + " | " + s[7] + " | " + s[8] + " | ");
        System.out.println("-------------");
        System.out.println("| " + s[3] + " | " + s[4] + " | " + s[5] + " | ");
        System.out.println("-------------");
        System.out.println("| " + s[0] + " | " + s[1] + " | " + s[2] + " | ");
        System.out.println("-------------");
    }

    private static void actionUser(char[] field) {
        char tmp = 'x';
        while (true) {
            String s = "test";
            while (true) {
                s = new Scanner(System.in).nextLine();
                if (s.length() == 1) {
                    break;
                }
                System.out.println("Try again. s.length() is not succsess");
            }
            char enter = s.charAt(0);
            boolean isDigitInBorder = (enter >= '1' && enter <= '9');
            if (isDigitInBorder && isCellIsEmpty(field[enter - 48 - 1]) || tmp == 'o') {
                field[enter - 48 - 1] = tmp;
                break;
            } else if (!isDigitInBorder) {
                System.out.println("Enter digit in 1 to 9.Try again");
            } else {
                System.out.println("Cell is full.Try again.");
            }
        }
    }

    private static boolean isCellIsEmpty(char tmp) {
        return tmp == ' ' && tmp != 'x' && tmp != 'o';
    }

    private static boolean isWinOrDraw(char[] s, char whoWin) {
        if (winCondition(s)) {
            if (whoWin == 'x') {
                System.out.println("User is win!!!");
            } else {
                System.out.println("Computer is win!!");
            }
            return true;
        } else if (isEmpty(s)) {
            System.out.println("Draw!");
            return true;
        } else return false;
    }

    private static boolean winCondition(char[] s) {
        return s[0] == s[1] && s[1] == s[2] && s[2] != ' ' || s[3] == s[4] && s[4] == s[5] && s[5] != ' ' || s[6] == s[7] && s[6] == s[8] && s[8] != ' ' || s[0] == s[3] && s[3] == s[6] && s[6] != ' ' || s[1] == s[4] && s[4] == s[6] && s[6] != ' ' || s[2] == s[5] && s[5] == s[8] && s[8] != ' ' || s[0] == s[4] && s[4] == s[8] && s[8] != ' ' || s[2] == s[4] && s[4] == s[6] && s[6] != ' ';
    }

    private static boolean isEmpty(char[] s) {
        for (char c : s) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }
}





