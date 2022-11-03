package com.nonsuch1.easy.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 *
 * A range [a,b] is the set of all integers from a to b (inclusive).
 *
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges,
 * and there is no integer x such that x is in one of the ranges but not in nums.
 *
 * Each range [a,b] in the list should be output as:
 *
 * "a->b" if a != b
 * "a" if a == b
 */
public class SummaryRanges {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ranges = solution.summaryRanges(new int[]{0, 1, 2, 3, 7, 8, 9, 15, 20, 21, 25, 26});
        System.out.println(ranges);
    }

    static class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> ranges = new ArrayList<>();
            int i = 0;
            while (i < nums.length) {
                int start = nums[i];
                while (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                    i++;
                }
                int end = nums[i];
                if (start == end) {
                    ranges.add(start + "");
                } else {
                    ranges.add(start + "->" + end);
                }
                i++;
            }
            return ranges;
        }
    }
}

