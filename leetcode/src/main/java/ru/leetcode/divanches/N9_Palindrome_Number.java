package ru.leetcode.divanches;

public class N9_Palindrome_Number {
    public static void main(String[] args) {
//        System.out.println(isPalindromeString(121));
//        System.out.println(isPalindromeString(1121));
//
//        System.out.println(isPalindromeReverseInt(123321));
//        System.out.println(isPalindromeReverseInt(1234321));
        System.out.println(isPalindromeReverseInt(10));
    }

    public static boolean isPalindromeString(int x) {
        if (x < 0) return false;

        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindromeReverseInt(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversed = 0;

        while (x > reversed) {
            reversed = (x % 10) + reversed * 10;
            x = x / 10;
        }

        return x == reversed || x == reversed/10;
    }
}
