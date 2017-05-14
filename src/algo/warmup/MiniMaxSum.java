package algo.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fluctuacia on 5/13/17.
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 5;
        int[] arr = new int[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            totalSum += arr[i];
        }

        Arrays.sort(arr);

        long minSum = totalSum - arr[n - 1];
        long maxSum = totalSum - arr[0];

        System.out.println(minSum + " " + maxSum);
    }
}
