package dev.kashtan.java.basic.section07_String;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class ReverseBuilderMy {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("HelloDmuty  123");
        System.out.println(builder.toString());

        for (int i = 0; i < builder.length() / 2; i++) {
            char tmp = builder.charAt(i);
            builder.insert(i, builder.charAt(builder.length() - 1 - i));
            builder.deleteCharAt(i + 1);
            builder.insert(builder.length() - 1 - i, tmp);
            builder.deleteCharAt(builder.length() - 1 - i);
        }


        System.out.println(builder.toString());


    }
}
