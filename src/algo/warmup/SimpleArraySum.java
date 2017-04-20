package algo.warmup;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/16/17 in Peet's Coffee.
 */
public class SimpleArraySum {

    private static int sum(int[] arr) {
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(sum(arr));
    }

}
