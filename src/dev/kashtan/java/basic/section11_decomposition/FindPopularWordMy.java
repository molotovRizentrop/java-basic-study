package dev.kashtan.java.basic.section11_decomposition;

import java.util.Arrays;

/**
 * @author kashtan
 * @link http://dev.kashtan
 */
public class FindPopularWordMy {
    public static void main(String[] args) {
        String text = "hello,java-world\tjava hello: I? Hello! Java World. java";

        String word = findPopularWord(text);

        System.out.println(word);
    }

    private static String findPopularWord(String text) {
        String textFormat = deleteOtherSymbol(text); //other specification
        String[] arrayWord = stringToWordArray(textFormat);
        toLowerWordInArray(arrayWord);
        String[] uniqueArrayWord = copyUniqueWordOfArray(arrayWord);
        int indexOfMostPopularWord = calculateMostPopularWord(uniqueArrayWord, arrayWord);

        return uniqueArrayWord[indexOfMostPopularWord];
    }

    private static String deleteOtherSymbol(String text) {
        StringBuilder builder = new StringBuilder();
        boolean res = true;
        for (int i = 0; i < text.length(); i++) {
            char tmp = text.toLowerCase().charAt(i);
            if (isSymbolAllowable(tmp)) {
                builder.append(tmp);
                res = true;
            } else {
                if (res) {
                    builder.append(' ');
                    res = false;
                }

            }
        }
        return builder.toString();
    }

    private static boolean isSymbolAllowable(char tmp) {
        if ((tmp >= '0' && tmp <= '9') || (tmp >= 'a' && tmp <= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    private static void toLowerWordInArray(String[] arrayWord) {
        for (int i = 0; i < arrayWord.length; i++) {
            arrayWord[i] = arrayWord[i].toLowerCase();
        }
    }

    private static int calculateMostPopularWord(String[] uniqueArrayWord, String[] arrayWord) {
        int[] result = new int[uniqueArrayWord.length];
        int indexOfMaxCount = 0;

        for (int i = 0; i < uniqueArrayWord.length; i++) {
            for (int j = 0; j < arrayWord.length; j++) {
                if (uniqueArrayWord[i].equals(arrayWord[j])) {
                    result[i]++;
                }
            }
            if (result[indexOfMaxCount] < result[i]) {
                indexOfMaxCount = i;
            }
        }
        return indexOfMaxCount;
    }

    private static String[] copyUniqueWordOfArray(String[] arrayWord) {
        int count = 0;
        String[] tmp = new String[arrayWord.length];

        for (int i = 0; i < arrayWord.length; i++) {
            String uniq = arrayWord[i];
            boolean res = true;
            for (int j = 0; j < count; j++) {
                if (tmp[j].equals(uniq)) {
                    res = false;
                }
            }
            if (res) {
                tmp[count++] = uniq;
            }
        }
        String[] result = new String[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = tmp[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static String[] stringToWordArray(String text) {
        int countSpace = calculateCountSpace(text);
        String[] stringToArray = copyStringToArray(text, countSpace);

        return stringToArray;
    }

    private static String[] copyStringToArray(String text, int countSpace) {
        String[] result = new String[countSpace];
        for (int i = 0; i < result.length; i++) {
            result[i] = "";
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                result[count] += text.charAt(i);
            } else {
                count++;
            }

        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static int calculateCountSpace(String text) {
        int count = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
