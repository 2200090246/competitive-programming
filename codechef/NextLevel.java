/*
problem statement
Next Level
Chef is playing a video game and has collected 
X
X stars. He needs at least 
60
60 stars to unlock the next level.

Determine whether Chef can unlock the next level.

Input Format
The only line contains an integer 
X
X — the number of stars Chef has collected.

Output Format
Print YES if Chef can unlock the next level, otherwise print NO.

Each letter of the output may be printed in either uppercase or lowercase, i.e, the strings NO, no, No, and nO will all be treated as equivalent.

Constraints
1
≤
X
≤
100
1≤X≤100
Sample 1:
Input
Output
45
No
Explanation:
Chef has 
45
45 stars, which is fewer than the required 
60
60 stars.

Sample 2:
Input
Output
80
Yes
Explanation:
Chef has 
80
80 stars, which is more than the required 
60
60 stars.

Sample 3:
Input
Output
60
Yes
Explanation:
Chef has 
60
60 stars, which is equal to the required 
60
60 stars.

accepted
Accepted
7071
total-Submissions
Submissions
8966
accuracy
Accuracy
87.73
Did you like the problem statement?
4 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x >=60){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}
}
