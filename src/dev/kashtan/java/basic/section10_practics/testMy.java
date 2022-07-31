package dev.kashtan.java.basic.section10_practics;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class testMy {
    public static void main(String[] args) {

        int count = 0;
        StringBuilder s = new StringBuilder();
        String result = "b1c";

        char tmp = result.charAt(count);
        int b = 0;
        while (b >= 0 && b <= 9) {
            b = b * 10 + Character.getNumericValue(result.charAt(++count));
        }
        System.out.println(b);
        /*while (b != 0){
            s.append(tmp);
            b--;
        }

         */

        System.out.println(s.toString());

    }
}
