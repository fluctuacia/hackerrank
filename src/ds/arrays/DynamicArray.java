package ds.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fluctuacia on 4/29/17.
 *
 * https://www.hackerrank.com/challenges/dynamic-array
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();

        List<List<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }

        int lastAns = 0;

        for (int i = 0; i < q; i++) {
            int type = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            int idx = (x ^ lastAns) % n;
            List<Integer> seq = seqList.get(idx);

            switch (type) {
                case 1:
                    seq.add(y);
                    break;
                case 2:
                    lastAns = seq.get(y % seq.size());
                    System.out.println(lastAns);
                    break;
                default:
                    throw new RuntimeException("Unsupported query type: " + type);
            }
        }

    }
}
