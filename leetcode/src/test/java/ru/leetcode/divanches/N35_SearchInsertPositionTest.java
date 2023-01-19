package ru.leetcode.divanches;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class N35_SearchInsertPositionTest {
    private static int[] array;

    @BeforeAll
    public static void setUp() {
        array = new int[]{1,3,5,6};
    }

    @Test
    public void test5() {
        searchInsert(5);
    }

    @Test
    public void test2() {
        searchInsert(2);
    }

    @Test
    public void test7() {
        searchInsert(7);
    }

    private void searchInsert(int target) {
        System.out.println(N35_SearchInsertPosition.searchInsert(array, target));
    }
}