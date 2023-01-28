package ru.leetcode.divanches;

/**
 * 152. Maximum Product Subarray
 * Medium
 * 15K
 * 446
 * Companies
 * Given an integer array nums, find a
 * subarray
 *  that has the largest product, and return the product.
 *
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 *
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2 * 104
 * -10 <= nums[i] <= 10
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

public class N152_Maximum_Product_Subarray {
    public static int maxProduct(int[] nums) {
        // Поскольку у нас цифры отрицательные и положительные,
        // то может случится такое, что '-' на '-' даст новый максимум
        // Поэтому мы на каждой итерации будем запомниать минимальное число и максимальное число
        // И обновлять их путем сравнения между max или min от ((макс*тек, мин*тек), тек)
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(Math.max(maxProduct * nums[i], minProduct * nums[i]), nums[i]);
            minProduct = Math.min(Math.min(temp * nums[i], minProduct * nums[i]), nums[i]);
            maxSoFar = Math.max(maxSoFar, maxProduct);
        }
        return maxSoFar;
    }

    public static int maxProduct2(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // O(n2)
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i ++) {
            int product = nums[i];
            maxProduct = Math.max(product, maxProduct);
            for (int j = i + 1; j < nums.length; j ++) {
                product = product * nums[j];
                maxProduct = Math.max(product, maxProduct);
            }
        }
        return maxProduct;
    }
}
