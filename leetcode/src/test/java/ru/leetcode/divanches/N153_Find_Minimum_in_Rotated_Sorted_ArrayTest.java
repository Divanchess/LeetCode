package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N153_Find_Minimum_in_Rotated_Sorted_ArrayTest {

    @Test
    void findMin1() {
        int[] nums = new int[]{3,4,5,1,2};
        assertEquals(1, N153_Find_Minimum_in_Rotated_Sorted_Array.findMin(nums));
    }

    @Test
    void findMin2() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        assertEquals(0, N153_Find_Minimum_in_Rotated_Sorted_Array.findMin(nums));
    }

    @Test
    void findMin3() {
        int[] nums = new int[]{11,13,15,17};
        assertEquals(11, N153_Find_Minimum_in_Rotated_Sorted_Array.findMin(nums));
    }

    @Test
    void findMin4() {
        int[] nums = new int[]{2,1};
        assertEquals(1, N153_Find_Minimum_in_Rotated_Sorted_Array.findMin(nums));
    }

    @Test
    void findMin5() {
        int[] nums = new int[]{2,3,1};
        assertEquals(1, N153_Find_Minimum_in_Rotated_Sorted_Array.findMin(nums));
    }
}