package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;
import ru.leetcode.divanches.common.N104.TreeNode;

import java.util.Arrays;
import java.util.List;


class N102_Binary_Tree_Level_Order_TraversalTest {

    @Test
    void levelOrderTest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("==========Tree:=========");
        N226_Invert_Binary_Tree.printTree(root, "root");

        List<List<Integer>> expected = Arrays.asList(List.of(3), List.of(9,20), List.of(15,7));

        System.out.println(N102_Binary_Tree_Level_Order_Traversal.levelOrder(root));
    }
}