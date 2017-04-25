package algo.warmup;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/23/17.
 */
public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] a = new int[] {a0, a1, a2};
        int[] b = new int[] {b0, b1, b2};
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                result[0]++;
            } else if (b[i] > a[i]) {
                result[1]++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        String separator = "", delimiter = " ";
        for (Integer value : result) {
            System.out.print(separator + value);
            separator = delimiter;
        }
        System.out.println("");
    }
}
