import java.util.*;
import java.lang.*;
import java.io.*;

/*
Problem: Gift Packs

Chef has A notebooks and B pens.

Each gift pack must contain:
- One notebook
- One pen

Each item can be used in only one pack.

Find the maximum number of complete gift packs Chef can prepare.

Input Format:
The only line contains two integers A and B.

Output Format:
Print a single integer representing the maximum number of complete gift packs.

Constraints:
0 <= A, B <= 1000

Sample Input:
5 3

Sample Output:
3

Explanation:
Chef can prepare 3 gift packs using 3 notebooks and 3 pens.
The remaining 2 notebooks cannot form another complete pack.

Approach:
The number of complete gift packs is limited by whichever item is available in
smaller quantity.

Therefore:
answer = min(A, B)

Time Complexity: O(1)
Space Complexity: O(1)
*/

public class GiftPacks
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = Math.min(A, B);

        System.out.println(ans);
    }
}