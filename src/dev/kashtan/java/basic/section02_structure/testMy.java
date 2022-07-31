package dev.kashtan.java.basic.section02_structure;

import java.util.Scanner;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class testMy {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println(a);

        double b = new Scanner(System.in).nextDouble();
        System.out.println(b);

        String s = new Scanner(System.in).nextLine();
        System.out.println(s);

        char c = new Scanner(System.in).nextLine().charAt(0);
        System.out.println(c);

        boolean d = new Scanner(System.in).nextBoolean();
        System.out.println(d);
    }

}
