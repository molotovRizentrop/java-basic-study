package dev.kashtan.java.basic.section11_decomposition;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class PrintArrayElementsMoreThanAvgMy {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 12};

        int[] result = findArrayElementsMoThanAvg(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }

    private static int[] findArrayElementsMoThanAvg(int[] array) {
        int avg = findAvgInArray(array);
        return extractElementMoreThanAvg(array, avg);//newResult;
    }

    private static int[] extractElementMoreThanAvg(int[] array, int avg) {
        int[] result = new int[array.length];
        int count = 0;

        for (int j : array) {
            if (j > avg) {
                result[count++] = j;
            }
        }

        int[] newResult = new int[count];

        System.arraycopy(result, 0, newResult, 0, count);

        return newResult;
    }

    private static int findAvgInArray(int[] array) {
        int sum = 0;
        double avg;
        for (int i : array) {
            sum += i;
        }

        avg = (double) sum / array.length;

        return avg - (int) avg >= 0.5 ? (int) avg : (int) avg + 1;
    }   // if (avg more than x.5) avg = x + 1
    // else                   avg = x
}
