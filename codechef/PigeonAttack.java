/*
 * CodeChef Problem: Pigeon Attack
 *
 * Problem Statement:
 *
 * Chef wants to put up a net to keep pigeons away from his balcony.
 *
 * It takes N minutes of actual work to put up the net.
 * However, every K-th minute, pigeons arrive and Chef cannot work.
 *
 * Pigeons arrive on minutes:
 * K, 2K, 3K, ...
 *
 * Find the total number of minutes, including the delayed minutes,
 * required for Chef to finish putting up the net.
 *
 * Input Format:
 * The first line contains an integer T, the number of test cases.
 *
 * Each test case contains two integers N and K:
 * N = number of minutes of actual work required
 * K = every K-th minute is a delay
 *
 * Output Format:
 * For each test case, print the total number of minutes required.
 *
 * Constraints:
 * 1 <= T <= 10^4
 * 1 <= N <= 100
 * 2 <= K <= 100
 *
 * Example:
 *
 * Input:
 * 4
 * 3 2
 * 5 3
 * 4 10
 * 7 4
 *
 * Output:
 * 5
 * 7
 * 4
 * 9
 *
 * Explanation:
 *
 * Test Case 1:
 * N = 3, K = 2
 *
 * Minute 1 -> Work
 * Minute 2 -> Pigeon
 * Minute 3 -> Work
 * Minute 4 -> Pigeon
 * Minute 5 -> Work
 *
 * Total time = 5 minutes
 *
 * Approach:
 * We simulate every minute.
 *
 * i -> represents the current minute.
 * c -> represents the number of minutes Chef has successfully worked.
 * ans -> represents the total elapsed time.
 *
 * If i is divisible by K, Chef cannot work during that minute.
 * Otherwise, Chef works and c is increased.
 *
 * Continue until Chef completes N minutes of work.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class PigeonAttack
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int i = 1;
            int c = 0;
            int ans = 0;

            while(n > c)
            {
                // Every K-th minute is a delay.
                if(i % k == 0)
                {
                    ans++;
                    i++;
                    continue;
                }

                // Chef works during this minute.
                c++;
                ans++;
                i++;
            }

            System.out.println(ans);

            t--;
        }
    }
}