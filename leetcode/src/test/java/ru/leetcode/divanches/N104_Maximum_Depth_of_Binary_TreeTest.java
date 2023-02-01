package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;
import ru.leetcode.divanches.common.N104.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class N104_Maximum_Depth_of_Binary_TreeTest {

    @Test
    void maxDepth1() {
        // Create a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(3, N104_Maximum_Depth_of_Binary_Tree.maxDepthWithLogging(root, "root"));
        assertEquals(3, N104_Maximum_Depth_of_Binary_Tree.maxDepth(root));
    }

    @Test
    void maxDepth2() {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        assertEquals(2, N104_Maximum_Depth_of_Binary_Tree.maxDepthWithLogging(root, "root"));
        assertEquals(2, N104_Maximum_Depth_of_Binary_Tree.maxDepth(root));
    }

    @Test
    void maxDepth3() {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.left.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        root.left.right.right.right.right = new TreeNode(8);

        root.right = new TreeNode(11);
        root.right.left = new TreeNode(12);
        root.right.left.left = new TreeNode(13);
        root.right.left.left.left = new TreeNode(14);

        assertEquals(6, N104_Maximum_Depth_of_Binary_Tree.maxDepthWithLogging(root, "root"));
        assertEquals(6, N104_Maximum_Depth_of_Binary_Tree.maxDepth(root));
    }
}