package algo.sorting;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/25/17.
 */
public class InsertionSortPart1 {

    public static void insertIntoSorted(int[] arr) {
        int n = arr.length;
        int val = arr[n - 1];
        for (int i = n - 2; i >= 0 && arr[i] > val; i--) {
            arr[i + 1] = arr[i];
            printArray(arr);
            arr[i] = val;
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        insertIntoSorted(arr);
    }
}
