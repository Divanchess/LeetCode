package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N238_Product_of_Array_Except_SelfTest {

    @Test
    public void productExceptSelf1() {
        int[] nums = new int[]{1,2,3,4};
        int[] result = new int[]{24,12,8,6};
        assertArrayEquals(result, N238_Product_of_Array_Except_Self.productExceptSelf(nums));
    }

    @Test
    public void productExceptSelf2() {
        int[] nums = new int[]{-1,1,0,-3,3};
        int[] result = new int[]{0,0,9,0,0};
        assertArrayEquals(result, N238_Product_of_Array_Except_Self.productExceptSelf(nums));
    }
}