/*
problem statement:
Exam Result
Chef has received his exam results. He answered 
C
C questions correctly and 
W
W questions incorrectly. Each correct answer earns 
M
M marks, while each incorrect answer deducts 
P
P marks.

Chef needs a final score of at least 
R
R marks to pass. Determine whether he passes the exam. His final score may be negative.

Input Format
The only line contains five space-separated integers 
C
C, 
M
M, 
W
W, 
P
P, and 
R
R.

Output Format
Print YES if Chef passes the exam, otherwise print NO.

Constraints
0
≤
C
,
W
≤
100
0≤C,W≤100
1
≤
M
,
P
≤
10
1≤M,P≤10
0
≤
R
≤
1000
0≤R≤1000
Sample 1:
Input
Output
8 4 2 1 30
YES
Explanation:
Chef earns 
8
×
4
=
32
8×4=32 marks and loses 
2
×
1
=
2
2×1=2 marks. His final score is 
30
30, exactly the required score, so he passes.

Sample 2:
Input
Output
0 4 5 2 0
NO
Explanation:
Chef earns no marks and loses 
5
×
2
=
10
5×2=10 marks. His final score is 
−
10
−10, which is below the required score of 
0
0, so he fails.

accepted
Accepted
4329
total-Submissions
Submissions
6563
accuracy
Accuracy
73.64
Did you like the problem statement?
8 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class ExamResult
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int m = sc.nextInt();
		int w = sc.nextInt();
		int p = sc.nextInt();
		int r = sc.nextInt();
		int score_for_correct_answers = c * m;
		int score_for_wrong_answers = w * p;
		int total_score = score_for_correct_answers - score_for_wrong_answers;
		if(total_score >= r){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
