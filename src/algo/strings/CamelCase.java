package algo.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fluctuacia on 4/29/17.
 *
 * https://www.hackerrank.com/challenges/camelcase
 */
public class CamelCase {

    /**
     * @param str not empty string
     * @return number of words in 'camel case' string
     * E.g. for saveChangesInTheEditor words count = 5
     */
    private static int wordsCountRegex(String str) {
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(str);
        int wordsCount = 1;
        while (m.find()) {
            wordsCount++;
        }
        return wordsCount;
    }

    /**
     * @param str not empty string
     * @return number of words in 'camel case' string
     * E.g. for saveChangesInTheEditor words count = 5
     */
    private static int wordsCount(String str) {
        int wordsCount = 1;
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                wordsCount++;
            }
        }
        return wordsCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        if (str.length() == 0) {
            throw new RuntimeException("String must not be empty");
        }
        if (!Character.isLowerCase(str.charAt(0))) {
            throw new RuntimeException("First character must be lowercase");
        }

        int wordsCount = wordsCount(str);

        System.out.println(wordsCount);
    }
}
