package dev.kashtan.java.basic.section05_cycles;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class MultiplicationTableCase1My {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == 1) {
                    System.out.print(" " + "\t");
                } else {
                    System.out.print(i * j + "\t");
                }
            }
            System.out.println();
        }
    }
}
