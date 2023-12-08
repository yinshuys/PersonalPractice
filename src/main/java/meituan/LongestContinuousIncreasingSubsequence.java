package meituan;

/**
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，
 * 都有 nums[i] < nums[i + 1] ，
 * 那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 */
public class LongestContinuousIncreasingSubsequence {
    /**
     * 贪心算法
     * @param nums
     * @return
     */
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0;
        int len = nums.length;
        int start = 0;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                start = i; //下一个连续升序的开始
            }
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }
}
