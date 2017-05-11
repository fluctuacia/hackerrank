package ds.arrays;

import java.util.Scanner;

/**
 * Created by fluctuacia on 5/5/17.
 */
public class LeftRotation {

    private static int[] rotate(int[] arr, int d) {
        int n = arr.length;

        int k = d % n;

        int[] newArr = new int[n];

        int j = 0;

        for (int i = k; i < n; i++, j++) {
            newArr[j] = arr[i];
        }
        for (int i = 0; i < k; i++, j++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int d = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] newArr = rotate(arr, d);

        for (int a : newArr) {
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
