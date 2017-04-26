package algo.sorting;

import java.util.Scanner;

/**
 * Created by fluctuacia on 4/25/17.
 */
public class InsertionSortPart2 {

    public static void insertionSortPart2(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int val = arr[i];
            for (int j = i - 1; j >= 0 && arr[j] > val; j--) {
                arr[j + 1] = arr[j];
                arr[j] = val;
            }
            printArray(arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] arr = new int[s];
        for(int i = 0;i < s; i++){
            arr[i] = in.nextInt();
        }
        insertionSortPart2(arr);

    }

    private static void printArray(int[] arr) {
        for(int n: arr){
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();
    }
}
