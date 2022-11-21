package com.nonsuch1.leetcode.binarySearch;

/**
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {

    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = (right + left) / 2;
                if (target == nums[mid])
                    return mid;
                if (target > nums[mid]) {
                    left = ++mid;
                } else {
                    right = --mid;
                }
            }
            return -1;
        }
    }

}
