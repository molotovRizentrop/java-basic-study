package dev.kashtan.java.basic.section10_practics;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class SimplestTextArchiverMy {
    public static void main(String[] args) {
        String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5);
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String unzip(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        while (count < s.length()) {
            char tmp = s.charAt(count++);
            int repeat = repeatFunc(s, count++);

            //trouble.i want repeat more then 9
            // if (repeat > 9 ) count++;//exCount = exCount + getCount(repeat);
            while (repeat != 0) {
                result.append(tmp);
                repeat--;
            }
        }
        return result.toString();
    }

    private static int getCount(int repeat) {
        int count = 0;
        if (repeat > 9) {
            count++;
        }
        return count;
    }

    private static int repeatFunc(String s, int count) {
        int tmp = Character.getNumericValue(s.charAt(count));
        int result = 0;
        while (tmp >= 0 && tmp <= 9) {
            result = result * 10 + tmp;
            if (count != s.length()) break;
            tmp = Character.getNumericValue(s.charAt(++count));
        }
        return result;
    }

    private static String zip(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        char tmp = '*';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count == 0) {
                result.append(c);
                tmp = c;
                count++;
            } else if (tmp == c) {
                count++;
            } else if (count > 0) {
                result.append(count);
                result.append(c);
                tmp = c;
                count = 1;
            }

        }
        result.append(count);

        return result.toString();
    }
}
