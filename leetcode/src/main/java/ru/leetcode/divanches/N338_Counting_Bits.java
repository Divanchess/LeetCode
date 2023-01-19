package ru.leetcode.divanches;

/**
 * 338. Counting Bits
 * Easy
 * 8.3K
 * 392
 * Companies
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * Example 2:
 *
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 *
 *
 * Constraints:
 *
 * 0 <= n <= 105
 *
 *
 * Follow up:
 *
 * It is very easy to come up with a solution with a runtime of O(n log n).
 * Can you do it in linear time O(n) and possibly in a single pass?
 * Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 */
public class N338_Counting_Bits {
    public static int[] countBits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive integer");
        }
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int k = i;
            //or call Integer.bitCount(i) - complexity O(n)
            while (k != 0) {
                count += k & 1;
                k = k >>> 1;
            }
            result[i] = count;
        }
        return result;
    }
}
