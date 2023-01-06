package com.nonsuch1.leetcode.arraysAndHashing.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 347. Top K Frequent Elements
 *
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> numFrequencyMap = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> numList = numFrequencyMap.entrySet().stream()
                .sorted((o1, o2) -> (int) (-o1.getValue() + o2.getValue()))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        int[] result = new int[k];
        int i = 0;
        int j = 0;
        while (i < k && j < numList.size()) {
            result[i++] = numList.get(j++);
        }
        return result;
    }
}
