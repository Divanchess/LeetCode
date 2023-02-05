package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;
import ru.leetcode.divanches.common.N104.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class N226_Invert_Binary_TreeTest {

    @Test
    void invertTreeTest1() {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode actualRoot = N226_Invert_Binary_Tree.invertTree(root);
        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(7);
        expected.left.left = new TreeNode(9);
        expected.left.right = new TreeNode(6);
        expected.right = new TreeNode(2);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);

        System.out.println("==========Tree original:=========");
        N226_Invert_Binary_Tree.printTree(root, "root");

        System.out.println("==========Tree expected:=========");
        N226_Invert_Binary_Tree.printTree(expected, "root");

        System.out.println("==========Tree actualRoot:=========");
        N226_Invert_Binary_Tree.printTree(actualRoot, "root");

        assertTrue(N100_Same_Tree.isSameTree(expected, actualRoot));
    }

    @Test
    void invertTreeTest2() {
        // Create a binary tree
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        N226_Invert_Binary_Tree.printTree(root1, "root");
        TreeNode root2 = N226_Invert_Binary_Tree.invertTree(root1);
        System.out.println("==========Tree:=========");
        N226_Invert_Binary_Tree.printTree(root2, "root");

        assertTrue(N100_Same_Tree.isSameTree(root1, root2));
    }

}