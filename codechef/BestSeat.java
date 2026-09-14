import java.util.*;
import java.lang.*;
import java.io.*;

/*
Problem: Best Seat

You are given an array A of N distinct integers, where Ai represents the
number of the i-th available seat in a cinema hall.

The center position is defined as the average of the smallest and largest
values in A. This position may not be an integer and may not correspond
to an available seat.

Find the available seat closest to the center position. If two seats are
equally close, choose the one with the smaller seat number.

Input Format:
The first line contains an integer N, the number of available seats.
The second line contains N distinct integers A1, A2, ..., AN.

Output Format:
Print a single integer representing the chosen seat number.

Constraints:
1 <= N <= 1000
1 <= Ai <= 10^9
All seat numbers are distinct.

Sample Input:
5
10 20 30 40 50

Sample Output:
30

Explanation:
The smallest and largest seat numbers are 10 and 50.
The center position is (10 + 50) / 2 = 30.
Seat 30 is exactly at the center.

Sample Input:
6
1 2 3 7 8 9

Sample Output:
3

Explanation:
The center position is (1 + 9) / 2 = 5.
Seats 3 and 7 are both 2 units away from the center.
Since 3 is smaller, the answer is 3.

Approach:
1. Sort the array.
2. The first element is the smallest seat and the last element is the largest.
3. Calculate the center using double to handle a fractional center.
4. Find the seat with the minimum distance from the center.
5. If two seats have the same distance, choose the smaller seat number.

Time Complexity: O(N log N)
Space Complexity: O(1) apart from the input array.
*/

public class BestSeat
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        double center = (arr[0] + arr[n - 1]) / 2.0;

        double mindis = Double.MAX_VALUE;
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            double dis = Math.abs(center - arr[i]);

            if (mindis > dis) {
                mindis = dis;
                answer = arr[i];
            }
            else if (mindis == dis) {
                answer = Math.min(answer, arr[i]);
            }
        }

        System.out.println(answer);
    }
}