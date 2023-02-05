package ru.leetcode.divanches;

import ru.leetcode.divanches.common.N104.TreeNode;

/**
 * 226. Invert Binary Tree
 * Easy
 *
 * 10897
 *
 * 153
 *
 * Add to List
 *
 * Share
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * Example 2:
 *
 *
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 * Example 3:
 *
 * Input: root = []
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */

public class N226_Invert_Binary_Tree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void printTree(TreeNode root, String type) {
        System.out.println(type + ": " + (root == null ? "null" : root.val));
        if (root == null) {
            return;
        }
        printTree(root.left, "left");
        printTree(root.right, "right");
    }

}
