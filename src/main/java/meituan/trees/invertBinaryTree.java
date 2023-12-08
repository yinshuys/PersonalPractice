package meituan.trees;

import meituan.trees.TreeNode;

/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class invertBinaryTree {
    /**
     * 递归
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode node) {
        if (node == null) return;
        invert(node.left);
        invert(node.right);
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
    }
}
