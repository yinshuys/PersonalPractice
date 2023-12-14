package meituan.ArrayOperation;


/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 */
public class findMissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] tmp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            tmp[nums[i]]++;
        }
        for (int j = 0; j <= n; j++) {
            if (tmp[j] == 0) return j;
        }
        return -1;
    }
}
