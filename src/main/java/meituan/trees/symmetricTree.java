package meituan.trees;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class symmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    public boolean check(TreeNode node01, TreeNode node02) {
        if (node01 == null && node02 == null) return true;
        else if (node01 == null || node02 == null) return false;
        return node01.val == node02.val && check(node01.left, node02.right) && check(node01.right, node02.left);
    }
}
