package dev.kashtan.java.basic.section09_recursion;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class FindMinElementUsingRecursionMy {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, 5, 4, 2, -21, 34};
        System.out.println(findMin(array));
    }

    // Iterative
    private static int findMin(int[] array) {
        int min = array[0];
        if (array.length > 1) {
            return findMin(1, min, array);
        }
        return min;
    }

    private static int findMin(int index, int min, int[] array) {
        if (index == array.length) {
            return min;
        } else if (min > array[index]) {
            min = array[index];
        }
        return findMin(index + 1, min, array);
    }

}
