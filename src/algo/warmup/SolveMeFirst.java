package algo.warmup;

import java.util.*;

/**
 * Created by fluctuacia on 4/15/17.
 */
public class SolveMeFirst {

    private static int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = sum(a, b);
        System.out.println(sum);
    }
}