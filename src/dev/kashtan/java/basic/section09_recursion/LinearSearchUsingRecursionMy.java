package dev.kashtan.java.basic.section09_recursion;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class LinearSearchUsingRecursionMy {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 43, 2, 4, 5, 2, 4, 3, 10};
        var query = 10;

        System.out.println(findIndex(array, query));
    }

    private static int findIndex(int[] array, int query) {
        return findIndex(array, query, 0);
    }

    private static int findIndex(int[] array, int query, int index) {
        if (index == array.length) {
            return -1;
        } else if (query == array[index]) {
            return index;
        }
        return findIndex(array, query, index + 1);
    }
}
