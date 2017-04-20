package ds.arrays;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/16/17.
 */
public class ArraysDS {

    private static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int tailIdx = n - i - 1;

            int a = arr[i];
            arr[i] = arr[tailIdx];
            arr[tailIdx] = a;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        reverse(arr);

        for (int a : arr) {
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
