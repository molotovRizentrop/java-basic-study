package dev.kashtan.java.basic.section04_conditional;

import java.util.Scanner;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class UniversalWeekDayMy {
    public static void main(String[] args) {
        int day = new Scanner(System.in).nextInt();
        boolean isMondeyFirst = false;

        int iternalDay = day;
        if (!isMondeyFirst) {
            if (iternalDay == 1) {
                iternalDay = 7;
            } else {
                iternalDay--;
            }
        }

        if (iternalDay == 1) {
            System.out.println("monday" + iternalDay);
        } else if (iternalDay == 2) {
            System.out.println("tuesday" + iternalDay);
        } else if (iternalDay == 3) {
            System.out.println("wednestday" + iternalDay);
        } else if (iternalDay == 4) {
            System.out.println("thursday" + iternalDay);
        } else if (iternalDay == 5) {
            System.out.println("fridey" + iternalDay);
        } else if (iternalDay == 6) {
            System.out.println("saturday" + iternalDay);
        } else if (iternalDay == 7) {
            System.out.println("sunday" + iternalDay);
        } else {
            System.out.println("error");
        }


    }
}
