/*
problem statement

**********************
Sandwiches
Chef is running a sandwich shop. He has 
B
B pieces of bread, 
H
H pieces of ham, and 
C
C pieces of cheese.

To make a sandwich, Chef uses 
2
2 pieces of bread, and one piece of either ham or cheese, not both.

Find the maximum number of sandwiches Chef can make.

Input Format
The first line contains 
3
3 integers - 
B
B, 
H
H and 
C
C.
Output Format
Output the maximum number of sandwiches Chef can make.

Constraints
1
≤
B
,
H
,
C
≤
10
1≤B,H,C≤10
Sample 1:
Input
Output
8 3 1
4
Explanation:
Chef can make 
3
3 ham sandwiches, and 
1
1 cheese sandwich, using exactly 
8
8 pieces of bread, 
3
3 pieces of ham, and 
1
1 piece of cheese.

Sample 2:
Input
Output
3 2 2
1
accepted
Accepted
23009
total-Submissions
Submissions
35164
accuracy
Accuracy
72.45
Did you like the problem statement?
48 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes

*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Sandwiches
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int h = sc.nextInt();
		int c = sc.nextInt();
		int ans = b/2;
		int n = h + c;
		if(n >= ans){
		    System.out.println(ans);
		}else{
		    System.out.println(n);
		}

	}
}
