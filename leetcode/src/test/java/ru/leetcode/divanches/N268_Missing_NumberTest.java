package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N268_Missing_NumberTest {

    @Test
    void missingNumber1() {
        int[] nums = new int[]{3,0,1};
        assertEquals(2, N268_Missing_Number.missingNumber(nums));
    }

    @Test
    void missingNumber2() {
        int[] nums = new int[]{0,1};
        assertEquals(2, N268_Missing_Number.missingNumber(nums));
    }

    @Test
    void missingNumber3() {
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        assertEquals(8, N268_Missing_Number.missingNumber(nums));
    }
}