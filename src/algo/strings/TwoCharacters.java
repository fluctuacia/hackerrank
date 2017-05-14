package algo.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by fluctuacia on 5/11/17.
 */
public class TwoCharacters {

    private static int lengthOfT(String s, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        Character prevChar = null;
        for (char c : s.toCharArray()) {
            if (c == c1 || c == c2) {
                if (prevChar != null && prevChar.equals(c)) {
                    return 0;
                }
                sb.append(c);
                prevChar = c;
            }
        }
        return sb.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String s = in.next();

        Set<Character> unqChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            unqChars.add(c);
        }

        int maxLength = 0;
        for (char c1 : unqChars) {
            for (char c2 : unqChars) {
                if (c1 == c2) {
                    continue;
                }
                int l = lengthOfT(s, c1, c2);
                maxLength = maxLength > l ? maxLength : l;
            }
        }

        System.out.println(maxLength);
    }
}
