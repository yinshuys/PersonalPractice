package meituan.trees;

import java.util.List;

/**
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。
 */
public class maximumDepthOfTree {
    /**
     * 深度遍历
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int high = 0;
        List<Node> list = root.children;
        for (Node node : list) {
            int max = maxDepth(node);
            high = Math.max(high, max);
        }
        return high + 1;
    }
}
