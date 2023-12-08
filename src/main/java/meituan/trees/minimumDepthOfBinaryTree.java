package meituan.trees;

/**
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 */
public class minimumDepthOfBinaryTree {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //要是有一个分支为null的话，最小深度不考虑这个分支，
        // 举例：根节点的左子树为null，不可能最小深度为1，因为root不是叶子节点
        if (right == 0 || left == 0) {
            return left + right + 1;
        } else
            return Math.min(left, right) + 1;
    }
}
