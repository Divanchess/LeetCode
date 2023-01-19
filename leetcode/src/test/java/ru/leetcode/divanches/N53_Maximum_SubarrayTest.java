package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N53_Maximum_SubarrayTest {

    @Test
    void maxSubArray1() {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, N53_Maximum_Subarray.maxSubArray(nums));
    }

    @Test
    void maxSubArray2() {
        int[] nums = new int[]{1};
        assertEquals(1, N53_Maximum_Subarray.maxSubArray(nums));
    }

    @Test
    void maxSubArray3() {
        int[] nums = new int[]{5,4,-1,7,8};
        assertEquals(23, N53_Maximum_Subarray.maxSubArray(nums));
    }

    @Test
    void maxSubArray4() {
        int[] nums = new int[]{-5,-4,-1,-7,-8};
        assertEquals(-1, N53_Maximum_Subarray.maxSubArray(nums));
    }
}