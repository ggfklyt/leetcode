package com.nonsuch1.leetcode.trees;

/**
 * 110. Balanced Binary Tree
 *
 * Given a binary tree, determine if it is
 * height-balanced.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *
 * Example 2:
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 * Input: root = []
 * Output: true
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 5000].
 * -104 <= Node.val <= 104
 *
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(maximumDepth(root.left) - maximumDepth(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int maximumDepth(TreeNode root) {
        if (root == null) return 0;
        return Integer.max(maximumDepth(root.left), maximumDepth(root.right)) + 1;
    }
}
