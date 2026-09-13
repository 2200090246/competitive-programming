/*Weekly contest
 * Problem: Cyclic Shift
 *
 * You are given an integer n, a 2D integer array grid of size n x n,
 * and two integer arrays rowShift and colShift of length n.
 *
 * rowShift[i] represents the number of positions to cyclically
 * left shift the ith row of grid.
 *
 * colShift[j] represents the number of positions to cyclically
 * upward shift the jth column of grid.
 *
 * First, shift every row according to rowShift.
 * Then, shift every column according to colShift.
 *
 * Return the resulting grid.
 *
 * Example:
 *
 * Input:
 * n = 2
 * grid = [[1, 2],
 *         [3, 4]]
 * rowShift = [1, 0]
 * colShift = [0, 1]
 *
 * Output:
 * [[2, 4],
 *  [3, 1]]
 *
 * Approach:
 * 1. Create a temporary matrix to store the grid after row shifts.
 * 2. For each element, calculate its new column using:
 *      newCol = (j - rowShift[i] + n) % n
 * 3. Create another matrix to store the grid after column shifts.
 * 4. For each element, calculate its new row using:
 *      newRow = (i - colShift[j] + n) % n
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 */

class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        int[][] res = new int[n][n];

        // First, cyclically left shift each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int newCol = (j - rowShift[i] + n) % n;
                res[i][newCol] = grid[i][j];
            }
        }

        // Then, cyclically upward shift each column
        int[][] finalRes = new int[n][n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {

                int newRow = (i - colShift[j] + n) % n;
                finalRes[newRow][j] = res[i][j];
            }
        }

        return finalRes;
    }
}