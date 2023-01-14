package com.nonsuch1.leetcode.trees;

/**
 * 543. Diameter of Binary Tree
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 * Example 1:
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Example 2:
 * Input: root = [1,2]
 * Output: 1
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 104].
 * -100 <= Node.val <= 100
 */
public class DiameterOfBinaryTree {
    class Diameter {
        private int value;
        public Diameter(int value) {
            this.value = value;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Diameter diameter = new Diameter(0);
        maximumHeight(root, diameter);
        return diameter.value;
    }

    private int maximumHeight(TreeNode root, Diameter diameter) {
        if (root == null) return 0;
        int left = maximumHeight(root.left, diameter);
        int right = maximumHeight(root.right, diameter);
        diameter.value = Integer.max(left + right, diameter.value);
        return 1 + Integer.max(left, right);
    }
}
