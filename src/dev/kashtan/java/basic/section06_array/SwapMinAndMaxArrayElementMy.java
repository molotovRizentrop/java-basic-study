package dev.kashtan.java.basic.section06_array;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class SwapMinAndMaxArrayElementMy {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};
        printArray(array);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int element = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = element;

        printArray(array);


    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
