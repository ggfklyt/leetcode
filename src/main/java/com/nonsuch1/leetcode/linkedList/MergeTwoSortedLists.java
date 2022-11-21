package com.nonsuch1.leetcode.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        Solution solution = new Solution();
        solution.mergeTwoLists(listNode1, listNode2);


    }

    private static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null)
                return list2;
            if (list2 == null)
                return list1;
            ListNode tail = null;
            ListNode head = null;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    if (head != null) {
                        tail.next = list1;
                        tail = tail.next;
                    } else {
                        head = list1;
                        tail = head;
                    }
                    list1 = list1.next;
                } else {
                    if (head != null) {
                        tail.next = list2;
                        tail = tail.next;
                    } else {
                        head = list2;
                        tail = head;
                    }
                    list2 = list2.next;
                }
            }
            while (list1 != null) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            while (list2 != null) {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
            return head;
        }
    }
}
