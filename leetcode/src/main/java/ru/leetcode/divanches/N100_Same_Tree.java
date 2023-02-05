package ru.leetcode.divanches;

import ru.leetcode.divanches.common.N104.TreeNode;

/**
 * 100. Same Tree
 * Easy
 *
 * 8794
 *
 * 179
 *
 * Add to List
 *
 * Share
 * Given the roots of two binary trees p and q, write a
 * function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are
 * structurally identical, and the nodes have the same value.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * Example 2:
 *
 *
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * Example 3:
 *
 *
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 *
 *
 * Constraints:
 *
 * The number of nodes in both trees is in the range [0, 100].
 * -104 <= Node.val <= 104
 */

public class N100_Same_Tree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p != null && q != null && p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
