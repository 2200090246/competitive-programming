/*
 * Codeforces Problem: Turn Into a Palindrome
 *
 * Problem Statement:
 *
 * Ali has a string s consisting of n lowercase Latin letters. He also has
 * a character c, which is a lowercase Latin letter. In one coin, he can
 * perform the following operation on the string s:
 *
 * 1. Choose an index 1 <= i <= n.
 * 2. Replace s[i] with the character c.
 *
 * Ali wants to turn the string s into a palindrome, but he does not want
 * to spend too many coins. Compute the minimum number of coins required.
 *
 * A string t of length m is a palindrome if:
 *     t[i] = t[m-i+1]
 * for every 1 <= i <= m.
 *
 * Input:
 * The first line contains the number of test cases t.
 * For each test case:
 * - The first line contains n and a lowercase character c.
 * - The second line contains the string s of length n.
 *
 * Output:
 * For each test case, print the minimum number of coins required.
 *
 * Example Input:
 *
 * 5
 * 4 b
 * abca
 * 3 p
 * xyx
 * 5 e
 * abcbb
 * 8 d
 * adbccbad
 * 10 c
 * codeforces
 *
 * Example Output:
 *
 * 1
 * 0
 * 2
 * 2
 * 8
 *
 * Approach:
 *
 * Compare characters from both ends of the string.
 *
 * - If both characters are equal, no operation is required.
 * - If they are different and one of them is c, one operation is enough.
 * - If they are different and neither is c, two operations are required.
 *
 * We only check the first half of the string because each pair is checked
 * exactly once.
 *
 * Time Complexity: O(n) per test case
 * Space Complexity: O(1)
 */

import java.util.*;

public class TurnIntoAPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            int count = 0;

            for (int i = 0; i < n / 2; i++) {
                char l = s.charAt(i);
                char r = s.charAt(n - i - 1);

                if (l == r)
                    continue;

                if (l == c || r == c) {
                    count++;
                } else {
                    count += 2;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
