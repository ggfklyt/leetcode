package com.nonsuch1.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s ="{}";
        int i = 0;
        while (i < s.length()) {
            System.out.println( '{' == (s.charAt(i++)));
        }
    }
    static class Solution {
        public boolean isValid(String s) {
            Deque<Character> queue = new ArrayDeque<>();
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');
            int i = 0;
            while (i < s.length()) {
                if (map.containsKey(s.charAt(i)))
                    queue.offer(map.get(s.charAt(i)));
                else if (queue.isEmpty() || !(queue.removeLast() == s.charAt(i)))
                    return false;
                i++;
            }
            return queue.isEmpty();
        }
    }
}
