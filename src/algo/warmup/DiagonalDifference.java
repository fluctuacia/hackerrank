package algo.warmup;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/29/17.
 *
 * https://www.hackerrank.com/challenges/diagonal-difference
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][n - i - 1];
        }

        System.out.print(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }
}
