package com.nonsuch1.heapPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 703. Kth Largest Element in a Stream
 * Design a class to find the kth largest element in a stream.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Implement KthLargest class:
 *
 * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
 * int add(int val) Appends the integer val to the stream and returns the element representing
 * the kth largest element in the stream.
 */
public class KthLargestElementInAStream {
    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(2, new int[]{7, 2, 5, 9});
    }

    static class KthLargest {
        private int k;
        private Queue<Integer> queue;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            queue = new PriorityQueue<>();
            for (int num : nums) {
                queue.offer(num);
            }
            while (queue.size() > k) {
                queue.poll();
            }
        }

        public int add(int val) {
            queue.offer(val);
            if (queue.size() > k) {
                queue.poll();
            }
            return queue.peek();
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

