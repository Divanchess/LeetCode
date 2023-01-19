package ru.leetcode.divanches;//https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// #1
public class N1_Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 4, 6, 7, 8, 9, 4, 0}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 4, 6, 7, 8, 9, 4, 0}, 13)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = target - nums[i];
            if (indexByValue.get(curr) != null) {
                return new int[]{i, indexByValue.get(curr)};
            }
            indexByValue.put(nums[i], i);
        }
        return null;
    }
}
