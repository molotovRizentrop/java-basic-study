package dev.kashtan.java.basic.section10_practics;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class BinarySearchRecursiveMy {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int element = 2;
        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearch(arr, element));


        int index = Arrays.binarySearch(arr, element);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int element) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        return binarySearch(arr, startIndex, endIndex, element);
    }

    private static int binarySearch(int[] arr, int startIndex, int endIndex, int element) {
        int index = (startIndex + endIndex) >>> 1;
        //int index = (startIndex + endIndex) / 2;// mb integer overflow
        if (startIndex <= endIndex) {
            if (element == arr[index]) {
                return index;
            } else if (element > arr[index]) {
                return binarySearch(arr, index + 1, endIndex, element);
            } else {
                return binarySearch(arr, startIndex, index - 1, element);
            }
        } else {
            return -1;
        }
    }
}
