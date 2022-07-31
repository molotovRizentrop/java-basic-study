package dev.kashtan.java.basic.section10_practics;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ExtractPositiveIntNumbersFromStringStringBuilderMy {
    public static void main(String[] args) {
        String s = "123,54353,1231";

        int[] arr = digitInString(s);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] digitInString(String s) {
        int[] arr = new int[s.length() / 2 + 1];
        int count = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isDigit(c)) {
                builder.append(c);
            } else if (builder.length() > 0) {
                arr[count++] = Integer.parseInt(builder.toString());
                builder.setLength(0);
            }
        }
        if (builder.length() > 0) {
            arr[count++] = Integer.parseInt(builder.toString());
        }

        return minimizArray(arr, count);
    }

    private static int[] minimizArray(int[] arr, int count) {
        int[] res = new int[count];
        for (int i = 0; i < count; i++) res[i] = arr[i];

        return res;
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}