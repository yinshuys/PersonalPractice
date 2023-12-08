package meituan.DynamicProgramming;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0, cost = Integer.MAX_VALUE;
        for (int price : prices) {
            cost = Math.min(price, cost);
            max = Math.max(max, price - cost);
        }
        return max;
    }
}
