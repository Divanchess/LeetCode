package ru.leetcode.divanches;

public class N35_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array does not contain any element");
        }
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int low = 0;
        int high = nums.length -1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            } else {
                if (target > nums[mid]) {
                    low = mid + 1;
                } else if (target < nums[mid]) {
                    high = mid - 1;
                }
            }
        }
        return low;
    }
}
