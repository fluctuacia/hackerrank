package algo.strings;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/23/17.
 */
public class SuperReducedString {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        char[] chars = in.next().trim().toCharArray();

        StringBuilder res = new StringBuilder();
        for (char c : chars) {
            int last = res.length() - 1;
            if (res.length() > 0 && c == res.charAt(last)) {
                res.deleteCharAt(last);
            } else {
                res.append(c);
            }
        }

        System.out.print(res.length() == 0 ? "Empty String" : res.toString());
    }
}
