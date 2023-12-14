package meituan.ArrayOperation;

/**
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 */
public class singleNumber {
    public int singleNumber1(int[] nums) {
        if (nums.length == 0) return -1;
        int res = nums[0];
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            res^=nums[i];
        }
        return res;
    }
}
