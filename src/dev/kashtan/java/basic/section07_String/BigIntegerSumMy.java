package dev.kashtan.java.basic.section07_String;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class BigIntegerSumMy {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("999");
        StringBuilder b = new StringBuilder("99");
        System.out.println(Integer.valueOf(a.charAt(a.length() - 1) - 48));//ASCII

        int maxLenght = a.length() > b.length() ? a.length() : b.length();
        /*
        if(a.length() < b.length()){
            StringBuilder tmp = new StringBuilder();
            tmp.append(b.toString());
            b.setLength(0);
            b.append(a.toString());
            a.setLength(0);
            a.append(tmp.toString());
        }

         */
        int tmp = 0;


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLenght + 1; i++) {
            int valueA = 0;
            int valueB = 0;
            if (a.length() - i > 0) valueA = Integer.valueOf(a.charAt(a.length() - 1 - i) - 48);
            if (b.length() - i > 0) valueB = Integer.valueOf(b.charAt(b.length() - 1 - i) - 48);

            int sum = valueA + valueB + tmp;
            if (sum != 0) {
                result.insert(0, sum % 10);
            }

            if (sum / 10 > 0) tmp = 1;
            else tmp = 0;

            if (sum == 0) break;
        }
        System.out.println(result.toString());
    }
}
