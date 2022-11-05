package com.nonsuch1.easy.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            int i = 0;
            Set<Integer> set = new HashSet<>();
            while (i < nums.length) {
                if (!set.add(nums[i++])) {
                    return true;
                }
            }
            return false;
        }
    }
}
