package dev.kashtan.java.basic.section07_String;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ReverseStringBuilderMy {
    public static void main(String[] args) {
        String result = "12345678";

        StringBuilder builder = new StringBuilder();
        for (int i = result.length() - 1; i >= 0; i--) {
            builder.append(result.charAt(i));
        }


        System.out.println(builder.toString());


    }
}
