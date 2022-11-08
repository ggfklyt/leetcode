package com.nonsuch1.linkedList;

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
            if (list1 == null && list2 == null)
                return null;
            ListNode current1 = list1;
            ListNode current2 = list2;
            ListNode result = null;
            ListNode head = null;

            while (current1 != null && current2 != null) {
                if (current1.val < current2.val) {
                    if (result != null) {
                        result.next = current1;
                        result = result.next;
                        current1 = current1.next;
                    } else {
                        head = current1;
                        result = head;
                        current1 = current1.next;
                    }
                } else {
                    if (result != null) {
                        result.next = current2;
                        result = result.next;
                        current2 = current2.next;
                    } else {
                        head = current2;
                        result = head;
                        current2 = current2.next;
                    }
                }
            }
            if (result != null) {
                while (current1 != null) {
                    result.next = current1;
                    result = result.next;
                    current1 = current1.next;
                }
                while (current2 != null) {
                    result.next = current2;
                    result = result.next;
                    current2 = current2.next;
                }
            }

            return head;
        }
    }
}
