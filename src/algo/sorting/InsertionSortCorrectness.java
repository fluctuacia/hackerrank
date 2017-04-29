package algo.sorting;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/29/17.
 */
public class InsertionSortCorrectness {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        insertionSort(arr);
    }
}
