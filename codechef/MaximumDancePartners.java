/*
 * Problem: Maximum Dance Partners
 *
 * Chef is arranging a dance competition for students standing in a row.
 * Their order is represented by a string S, where:
 *
 * 'x' represents a girl
 * 'y' represents a boy
 *
 * The order of the students cannot be changed.
 *
 * Each dance pair must:
 * - Contain one boy and one girl.
 * - Consist of two students standing next to each other.
 * - Use each student at most once.
 *
 * Find the maximum number of pairs that can be formed.
 *
 * ------------------------------------------------------------
 * Input Format:
 * ------------------------------------------------------------
 *
 * The first line contains an integer T, the number of test cases.
 * Each of the next T lines contains a string S.
 *
 * ------------------------------------------------------------
 * Output Format:
 * ------------------------------------------------------------
 *
 * For each test case, print the maximum number of pairs.
 *
 * ------------------------------------------------------------
 * Constraints:
 * ------------------------------------------------------------
 *
 * 1 <= T <= 100
 * 1 <= |S| <= 10^5
 * S contains only 'x' and 'y'.
 * Sum of |S| over all test cases <= 3 * 10^5
 *
 * ------------------------------------------------------------
 * Sample Input:
 * ------------------------------------------------------------
 *
 * 2
 * xxyyxy
 * yyyy
 *
 * Sample Output:
 * ------------------------------------------------------------
 *
 * 2
 * 0
 *
 * Explanation:
 *
 * For "xxyyxy":
 *
 * x x y y x y
 *     ^ ^     -> pair
 *           ^ ^ -> pair
 *
 * Maximum number of pairs = 2.
 *
 * For "yyyy":
 *
 * y y y y
 *
 * There is no boy-girl combination, so the answer is 0.
 *
 * ------------------------------------------------------------
 * Another Sample:
 * ------------------------------------------------------------
 *
 * Input:
 *
 * 2
 * yxyxyx
 * xyyyx
 *
 * Output:
 *
 * 3
 * 2
 *
 * ------------------------------------------------------------
 * Approach:
 * ------------------------------------------------------------
 *
 * Traverse the string from left to right.
 *
 * If two adjacent characters are different, they represent one valid
 * boy-girl pair.
 *
 * After forming a pair, increment i once more so that both students
 * are skipped and cannot be used again.
 *
 * Examples:
 *
 * xy -> valid pair
 * yx -> valid pair
 * xx -> invalid
 * yy -> invalid
 *
 * Important:
 * The length of the string does NOT have to be even.
 * Some students can remain unpaired because each student can belong
 * to AT MOST one pair.
 *
 * ------------------------------------------------------------
 * Time Complexity:
 * ------------------------------------------------------------
 *
 * O(N) for each test case
 *
 * ------------------------------------------------------------
 * Space Complexity:
 * ------------------------------------------------------------
 *
 * O(1)
 */

public class MaximumDancePartners {
    public int findMaximumPairs(String s) {

        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {

            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y') {
                ans++;
                i++;
            }
            else if (s.charAt(i) == 'y' && s.charAt(i + 1) == 'x') {
                ans++;
                i++;
            }
        }

        return ans;
    }
}