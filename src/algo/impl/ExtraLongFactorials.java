package algo.impl;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by fluctuacia on 4/29/17.
 *
 * https://www.hackerrank.com/challenges/extra-long-factorials
 * Print the factorial of N
 */
public class ExtraLongFactorials {
    private static BigDecimal TWO = new BigDecimal(2);

    private static BigDecimal fact(BigDecimal n) {
        if (n.compareTo(TWO) <= 0) {
            return n;
        }
        return n.multiply(fact(n.subtract(BigDecimal.ONE)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1 || n > 1000) {
            throw new RuntimeException("1 <= N <= 1000");
        }
        System.out.print(fact(new BigDecimal(n)));
    }
}
