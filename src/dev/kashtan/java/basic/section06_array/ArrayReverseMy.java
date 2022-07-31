package dev.kashtan.java.basic.section06_array;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ArrayReverseMy {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 6, 7};
        int[] reverseArray = new int[array.length];

        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[array.length - i - 1];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray));
    }
}
