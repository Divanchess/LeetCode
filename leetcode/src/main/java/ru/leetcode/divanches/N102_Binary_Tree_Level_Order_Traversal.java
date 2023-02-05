package ru.leetcode.divanches;

import ru.leetcode.divanches.common.N104.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 102. Binary Tree Level Order Traversal
 * Medium
 *
 * 12246
 *
 * 240
 *
 * Add to List
 *
 * Share
 * Given the root of a binary tree, return the level order traversal
 * of its nodes' values. (i.e., from left to right, level by level).
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 * Example 2:
 *
 * Input: root = [1]
 * Output: [[1]]
 * Example 3:
 *
 * Input: root = []
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 2000].
 * -1000 <= Node.val <= 1000
 */

public class N102_Binary_Tree_Level_Order_Traversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.pop();
                if (current != null) {
                    row.add(current.val);
                }
                if (current.left != null) {
                    queue.offerLast(current.left);
                }
                if (current.right != null) {
                    queue.offerLast(current.right);
                }
            }
            result.add(row);
        }
        return result;
    }
}
