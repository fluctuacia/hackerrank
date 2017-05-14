package algo.warmup;

import java.util.Scanner;

/**
 * Created by fluctuacia on 5/13/17.
 */
public class PlusMinus {

    private static void printFraction(int count, int total) {
        System.out.println(String.format( "%.6f", (double) count / total));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            if (v > 0) {
                posCount++;
            } else if (v < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }

        printFraction(posCount, n);
        printFraction(negCount, n);
        printFraction(zeroCount, n);
    }
}
