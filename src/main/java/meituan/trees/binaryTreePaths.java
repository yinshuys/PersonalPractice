package meituan.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * 叶子节点 是指没有子节点的节点。
 */
public class binaryTreePaths {
    /**
     * 递归
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        if (root.left == null || root.right == null) {
            res.add(root.val + "");
        }
        for (String str : binaryTreePaths(root.left)) {
            res.add(root.val + "->" + str);
        }
        for (String str : binaryTreePaths(root.right)) {
            res.add(root.val + "->" + str);
        }
        return res;
    }
}
