package meituan.trees;

/**
 * 给定一棵二叉树的根节点 root，请左右翻转这棵二叉树，并返回其根节点。
 */
public class overTurnTrees {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
