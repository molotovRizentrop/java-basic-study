package dev.kashtan.java.basic.section10_practics;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ExtractPositiveIntNumbersFromStringMy {
    public static void main(String[] args) {
        String s = "123,4324,0.0432,4,-1,9,312312,2232,k0";

        int[] result = getNumber(s);

        System.out.println(Arrays.toString(result));
    }

    private static int[] getNumber(String s) {
        s = s + " ";
        int[] arr = new int[s.length() / 2 + 1];
        boolean isPrev = false;
        int resToWrite = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') { //isDigit
                int tmp = s.charAt(i + 1) - 48;
                if (isPrev) {
                    resToWrite = resToWrite * 10 + tmp;
                } else {
                    resToWrite = tmp;
                    isPrev = true;
                }
            } else {
                if (isPrev) {
                    arr[count] = resToWrite;
                    count++;
                    resToWrite = 0;
                }
                isPrev = false;
            }
        }
        int[] newArr = new int[count];
        for (int i = 0; i < newArr.length; i++) newArr[i] = arr[i];

        return newArr;
    }
}