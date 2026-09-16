/*
    Problem: Sharing Cookies

    Alice received A cookies and Bob received B cookies individually.
    Alice received more cookies than Bob, i.e. A > B.

    They want to share the cookies equally.

    Find the number of cookies Alice has to give Bob so that
    both have an equal number of cookies.

    If it is impossible, print -1.

    Input Format:
    The first and only line contains two integers A and B.

    Output Format:
    Print the number of cookies Alice needs to give Bob,
    or -1 if it is impossible.

    Constraints:
    1 <= B < A <= 10

    Sample 1:
    Input:
    6 2

    Output:
    2

    Explanation:
    If Alice gives Bob 2 cookies:
    Alice = 6 - 2 = 4
    Bob   = 2 + 2 = 4

    Sample 2:
    Input:
    5 2

    Output:
    -1

    Explanation:
    Total cookies = 5 + 2 = 7.
    Since 7 cannot be divided equally between Alice and Bob,
    it is impossible.
*/

import java.util.*;

public class SharingCookies
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        if (sum % 2 == 1) {
            System.out.println(-1);
            return;
        }

        int avg = sum / 2;
        int ans = avg - b;

        System.out.println(ans);
    }
}