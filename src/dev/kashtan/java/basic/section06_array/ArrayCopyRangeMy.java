package dev.kashtan.java.basic.section06_array;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ArrayCopyRangeMy {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int startIndex = 5;
        int endIndex = 8;

        int[] result = new int[endIndex - startIndex];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[startIndex++];
        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(result));
    }
}
