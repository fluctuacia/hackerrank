package ds.arrays;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/23/17.
 */
public class D2ArrayDS {
    private static int N = 6;

    // (i,j) - position in the middle of hourglass
    private static int hourGlassSum(int[][] arr, int i, int j) {
        return arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + // top
                arr[i][j] + // middle
                arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1]; // bottom
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                int currentMax = hourGlassSum(arr, i, j);
                maxSum = currentMax > maxSum ? currentMax : maxSum;
            }
        }

        System.out.println(maxSum);
    }
}
