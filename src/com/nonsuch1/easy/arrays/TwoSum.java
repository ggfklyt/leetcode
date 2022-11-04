package com.nonsuch1.easy.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {


    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int length = nums.length;
            int i = 0;
            int first = 0;
            int second = 0;

            while (i < length - 1) {
                first = i++;
                int j = i;
                while (j < length - 1 && nums[first] + nums[j] != target) {
                    j++;
                }
                if (nums[first] + nums[j] == target) {
                    second = j;
                    return new int[]{first, second};
                }
            }
            return null;
        }
    }
}

