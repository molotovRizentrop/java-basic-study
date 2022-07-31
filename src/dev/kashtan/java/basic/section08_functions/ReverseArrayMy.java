package dev.kashtan.java.basic.section08_functions;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ReverseArrayMy {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);

        revers(array);

        printArray(array);
        //System.out.println(Arrays.toString(array));
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void revers(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        System.out.println();
    }
}
