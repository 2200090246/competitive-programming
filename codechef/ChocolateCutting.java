/*
problem Statement
*********************
Chocolate Cutting
Chef has a chocolate bar which is a rectangle-shaped of size 
N
×
M
N×M chocolate pieces.

He wants to divide this chocolate into 
2
2 equal pieces with a cut along a grid line. The cut needs to be parallel to the sides of the chocolate, and it cannot go through the middle of any chocolate piece.

Print 
Yes
Yes if it is possible to divide the chocolate into 
2
2 equal pieces following these rules, and 
No
No otherwise.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first and only line contains 
2
2 integers - 
N
N and 
M
M.
Output Format
For each test case, output on a new line 
Yes
Yes if it is possible to divide the chocolate bar into 
2
2 equal pieces and 
No
No otherwise.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
,
M
≤
10
1≤N,M≤10
Sample 1:
Input
Output
4
1 1
1 2
3 4
3 5
No
Yes
Yes
No
Explanation:
Test Case 1: There is only 
1
1 chocolate piece, so it would be impossible anyways to split into 
2
2.

Test Case 2: You can do one vertical cut to get 
2
2 
1
×
1
1×1 pieces.

accepted
Accepted
24106
total-Submissions
Submissions
31289
accuracy
Accuracy
82.56
Did you like the problem statement?
23 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class ChocolateCutting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if((m * n) % 2 == 1){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}

	}
}
