package algo.impl;

import java.util.Scanner;

/**
 * Created by fluctuacia on 5/14/17.
 */
public class GridSearch {

    private static boolean findPattern(int[][] G, int[][] P) {
        for (int i = 0; i <= G.length - P.length; i++) {
            for (int j = 0; j <= G[i].length - P[0].length; j++) {
                if (G[i][j] == P[0][0] && findPattern(G, i, j, P)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findPattern(int[][] G, int iStart, int jStart, int[][] P) {
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[i].length; j++) {
                if (P[i][j] != G[i + iStart][j + jStart]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++){
            int R = in.nextInt();
            int C = in.nextInt();
            int[][] G = new int[R][C];
            for (int i = 0; i < R; i++) {
                String row = in.next();
                for (int j = 0; j < row.length(); j++) {
                    G[i][j] = row.charAt(j);
                }
            }

            int r = in.nextInt();
            int c = in.nextInt();

            int[][] P = new int[r][c];
            for (int i = 0; i < r; i++) {
                String row = in.next();
                for (int j = 0; j < row.length(); j++) {
                    P[i][j] = row.charAt(j);
                }
            }

            System.out.println(findPattern(G, P) ? "YES" : "NO");
        }
    }
}
