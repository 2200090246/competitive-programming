/*
 * Problem: Quantum Chips
 *
 * NVIDIA is working on tools that help researchers build and test
 * quantum-computing systems.
 *
 * A research lab initially has X quantum chips.
 * NVIDIA provides Y more chips for testing.
 *
 * During testing, exactly 2Z chips become unavailable.
 *
 * Find the number of chips remaining for further experiments.
 *
 * Input Format:
 * The first line contains three space-separated integers X, Y, and Z.
 *
 * Output Format:
 * Print a single integer - the number of chips remaining.
 *
 * Constraints:
 * 1 <= X, Y <= 1000
 * 0 <= Z <= 500
 * 2Z <= X + Y
 *
 * Sample Input 1:
 * 40 20 5
 *
 * Sample Output 1:
 * 50
 *
 * Explanation:
 * Initially, the lab has:
 * X + Y = 40 + 20 = 60 chips
 *
 * Chips that become unavailable:
 * 2Z = 2 * 5 = 10 chips
 *
 * Remaining chips:
 * 60 - 10 = 50 chips
 *
 * Sample Input 2:
 * 75 25 20
 *
 * Sample Output 2:
 * 60
 *
 * Explanation:
 * Initially, the lab has:
 * X + Y = 75 + 25 = 100 chips
 *
 * Chips that become unavailable:
 * 2Z = 2 * 20 = 40 chips
 *
 * Remaining chips:
 * 100 - 40 = 60 chips
 *
 * Approach:
 * 1. Read X, Y, and Z.
 * 2. Calculate the total number of chips: X + Y.
 * 3. Calculate unavailable chips: 2 * Z.
 * 4. Subtract unavailable chips from total chips.
 * 5. Print the remaining chips.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.*;

public class QuantumChips {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int total_Chips = x + y;
        int remaining_chips = total_Chips - (2 * z);

        System.out.println(remaining_chips);

        sc.close();
    }
}