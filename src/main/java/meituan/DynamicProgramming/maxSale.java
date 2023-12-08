package meituan.DynamicProgramming;

/**
 * 某公司每日销售额记于整数数组 sales，请返回所有连续一或多天销售额总和的最大值。
 * 要求实现时间复杂度为 O(n) 的算法。
 */
public class maxSale {
    /**
     * 动态规划
     * @param sales
     * @return
     */
    public int maxSales(int[] sales) {
        int len = sales.length;
        int max = sales[0], cur = sales[0];
        for (int i = 1; i < len; i++) {
            cur = Math.max(sales[i], cur + sales[i]);
            max = Math.max(cur, max);
        }
        return max;
    }
}
