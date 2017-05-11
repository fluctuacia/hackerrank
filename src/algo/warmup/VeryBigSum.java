package algo.warmup;

import java.util.Scanner;

/**
 * Created by fluctuacia on 5/11/17.
 */
public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
