package dev.kashtan.java.basic.section05_cycles;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class DisplayNumbersFrom100To1My {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            System.out.print(" " + i);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
