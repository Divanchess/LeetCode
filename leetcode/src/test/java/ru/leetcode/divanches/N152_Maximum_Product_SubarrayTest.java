package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N152_Maximum_Product_SubarrayTest {

    @Test
    void maxProduct1() {
        int[] nums = new int[]{2,3,-2,4};
        assertEquals(6, N152_Maximum_Product_Subarray.maxProduct(nums));
    }

    @Test
    void maxProduct2() {
        int[] nums = new int[]{2,3,-2,-4};
        assertEquals(48, N152_Maximum_Product_Subarray.maxProduct(nums));
    }

    @Test
    void maxProduct3() {
        int[] nums = new int[]{-2,0,-1};
        assertEquals(0, N152_Maximum_Product_Subarray.maxProduct(nums));
    }
}