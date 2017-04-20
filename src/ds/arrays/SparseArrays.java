package ds.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by fluctuacia on 4/16/17.
 */
public class SparseArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int strN = in.nextInt();
        Map<String, Integer> strings = new HashMap<>();
        for (int i = 0; i < strN; i++) {
            in.nextLine();
            String str = in.next();
            strings.merge(str, 1, Integer::sum);
        }

        int qN = in.nextInt();
        String[] queries = new String[qN];
        for (int i = 0; i < qN; i++) {
            in.nextLine();
            queries[i] = in.next();
        }

        for (String q : queries) {
            System.out.println(strings.getOrDefault(q, 0));
        }
    }
}