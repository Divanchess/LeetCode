package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N217_Contains_DuplicateTest {

    @Test
    void containsDuplicate1() {
        int[] array = new int[]{1,2,3,1};
        assertTrue(N217_Contains_Duplicate.containsDuplicate(array));
    }

    @Test
    void containsDuplicate2() {
        int[] array = new int[]{1,2,3,4};
        assertFalse(N217_Contains_Duplicate.containsDuplicate(array));
    }

    @Test
    void containsDuplicate3() {
        int[] array = new int[]{1,1,1,3,3,4,3,2,4,2};
        assertTrue(N217_Contains_Duplicate.containsDuplicate(array));
    }

}