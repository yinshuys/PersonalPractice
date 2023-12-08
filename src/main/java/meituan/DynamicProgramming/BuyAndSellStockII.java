package meituan.DynamicProgramming;

/**
 * 给你一个整数数组 prices，其中 prices[i]表示某支股票第i天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多只能持有一股股票。
 * 你也可以先购买，然后在同一天出售。
 * 返回你能获得的最大利润 。
 */
public class BuyAndSellStockII {
    /**
     * 动态规划
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int[][] dp = new int[len][2];
        dp[0][0] = 0; //存放收益
        dp[0][1] = -prices[0]; //存放支出
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(prices[i] + dp[i - 1][1], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[len - 1][0];
    }

    /**
     * 优化空间
     *
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int profit = 0, cost = -prices[0];
        for (int i = 1; i < len; i++) {
            int preCost = cost, preProfit = profit;
            profit = Math.max(prices[i] + preCost, preProfit);
            cost = Math.max(preCost, preProfit - prices[i]);
        }
        return profit;
    }
}
