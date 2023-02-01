package ru.leetcode.divanches;

import ru.leetcode.divanches.common.N104.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 * Easy
 *
 * 9520
 *
 * 157
 *
 * Add to List
 *
 * Share
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the
 * longest path from the root node down to the farthest leaf node.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 *
 * Input: root = [1,null,2]
 * Output: 2
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 104].
 * -100 <= Node.val <= 100
 */

public class N104_Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // Суть: когда мы дойдем до тупиковой ноды, без дочерних -
        // у нее будет left = 0 и right = 0 и в ней будет посчитан максимум от этих чисел+1
        // таким образом из этой ноды вернется 1 в родительскую, из которой тоже будет посчитан максимум
        // между левой стороной и правой и сделан + 1. Таким образом получится уже 2.
        // То есть этот алгоритм позволяет подсчитать каждый уровень, возвращая снизу наверх кол-во уровней.
        // Сложность по скорости будет O(n), потому что по факту нам приедтся обойти все ноды.
        // Сложность по памяти будет O(h), где h - высота дерева,
        // поскольку в один момент времени мы обходим по факту только одну сторону - сначала левую, потом правую
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int maxDepth = Math.max(left, right) + 1;

        return maxDepth;
    }

    public static int maxDepthWithLogging(TreeNode root, String type) {
        if (root == null) return 0;
        // Решение рекурсивным вызовом метода для обхода
        int left = maxDepthWithLogging(root.left, "left");
        int right = maxDepthWithLogging(root.right, "right");

        int maxDepth = Math.max(left, right) + 1;

        /** LOGGING **/
        System.out.println("call type : " + type + "; current val : " + root.val);
        System.out.println("left: " + left + "; value: " + (root.left != null ? root.left.val : null) + " ; root val : " + root.val);
        System.out.println("right: " + right + "; value: " + (root.right != null ? root.right.val : null) + " ; root val : " + root.val);
        System.out.println("left & right: " + left + " & " + right);
        System.out.println("maxDepth: " + maxDepth);

        return maxDepth;
    }
}
