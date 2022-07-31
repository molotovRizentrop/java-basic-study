package dev.kashtan.java.basic.section08_functions;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ArrayElementStatisticMy {
    public static void main(String[] args) {

        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        int[][] result = getArrayElementStatistics(array);

        printArrayElementStatistics(array, result);


    }

    private static void printArrayElementStatistics(int[] array, int[][] result) {
        for (int[] ints : result) {
            System.out.println(ints[0] + " = " + (double) ints[1] / array.length * 100 + "%");
        }
    }

    private static int[][] getArrayElementStatistics(int[] array) {
        int[] uniqueArray = new int[array.length];
        int[] uniqueArrayCountElement = new int[array.length];
        int countUniqueElement = 0;

        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            if (!uniqueElementInArray(array, i, element)) {
                uniqueArray[countUniqueElement] = element;
                for (int k : array) {
                    if (element == k) {
                        uniqueArrayCountElement[countUniqueElement]++;
                    }
                }
                countUniqueElement++;
            }
        }

        int[][] result = new int[countUniqueElement][2];
        for (int i = 0; i < countUniqueElement; i++) {
            result[i][0] = uniqueArray[i];
            result[i][1] = uniqueArrayCountElement[i];
        }
        return result;
    }

    private static boolean uniqueElementInArray(int[] array, int i, int element) {
        for (int j = 0; j < i; j++) {
            if (element == array[j]) {
                return true;
            }
        }
        return false;
    }
}
