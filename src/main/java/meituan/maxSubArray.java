package meituan;

public class maxSubArray {
    public int MaxSum(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i-1],0) + nums[i];
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
