package dev.kashtan.java.basic.section10_practics;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class BinarySearchIterativeMy {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(arr));

        int element = 7;
        System.out.println(binarySearch(arr, element));
    }

    private static int binarySearch(int[] arr, int element) {

        int endIndex = arr.length - 1;
        int startIndex = 0;
        while (startIndex <= endIndex) {
            int index = (startIndex + endIndex) >>> 1;
            // int index = (startIndex + endIndex) / 2; // mb integer overflow
            if (element == arr[index]) {
                return index;
            } else if (element > arr[index]) {
                startIndex = index + 1;
            } else {
                endIndex = index - 1;
            }
        }
        return -1;
    }
}
