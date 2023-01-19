package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N33_Search_in_Rotated_Sorted_ArrayTest {

    @Test
    void search1() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        assertEquals(4, N33_Search_in_Rotated_Sorted_Array.search(nums, 0));
    }

    @Test
    void search2() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        assertEquals(-1, N33_Search_in_Rotated_Sorted_Array.search(nums, 3));
    }

    @Test
    void search3() {
        int[] nums = new int[]{1};
        assertEquals(-1, N33_Search_in_Rotated_Sorted_Array.search(nums, 0));
    }
}