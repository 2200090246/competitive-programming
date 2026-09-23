/*
 * Problem: Echo
 *
 * A string of length 4 is called an echo if:
 *
 * S1 = S3
 * S2 = S4
 *
 * Given a string of length 4, check whether it is an echo.
 *
 * Input:
 * A single string S of length 4.
 *
 * Output:
 * Print "Yes" if S is an echo.
 * Otherwise, print "No".
 *
 * Example 1:
 * Input:
 * meme
 *
 * Output:
 * Yes
 *
 * Example 2:
 * Input:
 * ever
 *
 * Output:
 * No
 *
 * Approach:
 * Since Java uses 0-based indexing, we need to check:
 *
 * s[0] == s[2]
 * s[1] == s[3]
 *
 * If both conditions are true, the string is an echo.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Echo
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s.length() != 4) {
            System.out.println("No");
            return;
        }
        else {
            for(int i = 0; i < s.length() - 2; i++) {
                if(s.charAt(i) != s.charAt(i + 2)) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}