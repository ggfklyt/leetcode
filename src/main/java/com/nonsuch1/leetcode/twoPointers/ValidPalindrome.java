package com.nonsuch1.leetcode.twoPointers;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    static class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i++) != s.charAt(j--))
                    return false;
            }
            return true;
        }
    }
}
