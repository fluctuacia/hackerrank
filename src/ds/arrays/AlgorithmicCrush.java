package ds.arrays;

/**
 * Created by fluctuacia on 4/23/17.
 */

import java.util.Scanner;

/**
 5 3
 1 2 100
 2 5 100
 3 4 100

 difference array
          #   1.......................N....N+1
 5 3      #   0     0     0     0     0     0
 1 2 100  # 100     0  -100     0     0     0
 2 5 100  # 100   100  -100     0     0  -100
 3 4 100  # 100   100     0     0  -100  -100

 then -> max prefix sum
 */
public class AlgorithmicCrush {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        long[] vals = new long[n + 1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();

            vals[a - 1] += k;
            vals[b] -= k;
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vals[i];
            max = sum > max ? sum : max;
        }

        System.out.println(max);
    }
}
