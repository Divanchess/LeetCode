package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class N49_Group_AnagramsTest {

    @Test
    void groupAnagrams1() {
        String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("nat","tan"));
        expected.add(Arrays.asList("ate","eat","tea"));

        List<List<String>> actual = N49_Group_Anagrams.groupAnagrams(arr);

        assertEquals(expected.size(), actual.size());
        for (int i = 0 ; i < expected.size(); i ++) {
            Collections.sort(expected.get(i));
            Collections.sort(actual.get(i));
        }
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }

    @Test
    void groupAnagrams2() {
        String[] arr = new String[]{""};
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of(""));
        List<List<String>> actual = N49_Group_Anagrams.groupAnagrams(arr);
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }

    @Test
    void groupAnagrams3() {
        String[] arr = new String[]{"a"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("a"));
        List<List<String>> actual = N49_Group_Anagrams.groupAnagrams(arr);
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }
}