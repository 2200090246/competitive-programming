/*
Q1. Number of Intersecting Interval Pairs I
Difficulty: Easy
Points: 3

Problem:
You are given a 2D integer array intervals of n elements, where
intervals[i] = [starti, endi] represents the closed interval from starti to endi.

Return the number of pairs of indices (i, j) such that:
0 <= i < j < n

and intervals[i] and intervals[j] intersect.

Two intervals intersect if they have at least one point in common,
including when they only share an endpoint.

Example 1:
Input:
intervals = [[1,2],[2,3],[3,4]]

Output:
2

Explanation:
[1,2] and [2,3] intersect at 2.
[2,3] and [3,4] intersect at 3.

Example 2:
Input:
intervals = [[1,5],[2,4],[3,6]]

Output:
3

Explanation:
[1,5] and [2,4] intersect.
[1,5] and [3,6] intersect.
[2,4] and [3,6] intersect.

Example 3:
Input:
intervals = [[1,2],[3,4],[5,6]]

Output:
0

Explanation:
There are no intersecting interval pairs.

Constraints:
2 <= intervals.length <= 100
0 <= starti <= endi <= 100
*/

/*
Approach:
1. Take every possible pair of intervals.
2. We use i < j so that each pair is checked only once.
3. For two intervals:
      [start1, end1]
      [start2, end2]

   They intersect if:
      start1 <= end2 && start2 <= end1

4. If they intersect, increase count.
5. Return count.

Why does the condition work?

For:
[1,5]
[3,6]

start1 <= end2
1 <= 6  -> true

start2 <= end1
3 <= 5  -> true

Both are true, so the intervals intersect.

Endpoint example:
[1,2]
[2,3]

1 <= 3 -> true
2 <= 2 -> true

They intersect at point 2, so <= is used instead of <.
*/

class Solution {
    public int countIntersectingIntervals(int[][] intervals) {

        int r = intervals.length;
        int count = 0;

        for (int i = 0; i < r; i++) {

            for (int j = i + 1; j < r; j++) {

                int start1 = intervals[i][0];
                int end1 = intervals[i][1];

                int start2 = intervals[j][0];
                int end2 = intervals[j][1];

                if (start1 <= end2 && start2 <= end1) {
                    count++;
                }
            }
        }

        return count;
    }
}
