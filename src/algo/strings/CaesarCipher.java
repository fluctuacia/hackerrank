package algo.strings;

import java.util.Scanner;

/**
 * Created by fluctuacia on 5/13/17.
 */
public class CaesarCipher {

    private static int LETTERS_COUNT = 26;

    private static char rotate(char c, int k, int lowerCode, int upperCode) {
        int code = (int) c;
        int newVal = code + k;
        if (newVal > upperCode) {
            newVal = lowerCode + (newVal - upperCode) - 1;
        }
        return (char) newVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt() % LETTERS_COUNT;

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            char newChar;
            if (Character.isUpperCase(c)) {
                newChar = rotate(c, k, 65, 90); // A-Z
            } else if (Character.isLowerCase(c)) {
                newChar = rotate(c, k, 97, 122); // a-z
            } else {
                newChar = c;
            }
            sb.append(newChar);
        }

        System.out.println(sb.toString());
    }
}
