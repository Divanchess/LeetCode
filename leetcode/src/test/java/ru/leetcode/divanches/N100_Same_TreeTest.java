package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;
import ru.leetcode.divanches.common.N104.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class N100_Same_TreeTest {

    @Test
    void isSameTreeTest1() {
        // Create a binary tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        assertTrue(N100_Same_Tree.isSameTree(root1, root2));
    }

    @Test
    void isSameTreeTest2() {
        // Create a binary tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        assertFalse(N100_Same_Tree.isSameTree(root1, root2));
    }

    @Test
    void isSameTreeTest3() {
        // Create a binary tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);

        assertFalse(N100_Same_Tree.isSameTree(root1, root2));
    }
}