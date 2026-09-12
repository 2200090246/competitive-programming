/*
 * Codeforces - A. Min Max Game
 * Solution in Java
 *
 * Idea:
 * Bessie wins if the number of 1s is at least ceil(n/2).
 * Otherwise, Elsie wins.
 */

import java.util.*;

public class MinMaxGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int n1 = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    n1++;
                }
            }

            if (n1 >= (n + 1) / 2) {
                System.out.println("Bessie");
            } else {
                System.out.println("Elsie");
            }

            t--;
        }

        sc.close();
    }
}