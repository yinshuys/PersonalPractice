package meituan.SearchAlgorithm;

import com.sun.org.apache.bcel.internal.generic.I2F;

public class shellSort {
    /**
     * 希尔排序
     * 插入排序的步长发生了变化
     *
     * @param nums
     */
    public void Shell_Sort(int[] nums) {
        int len = nums.length;
        // 第一层循环设置gap
        for (int k = len / 2; k > 0; k /= 2) {
            //
            for (int i = k; i < nums.length; i++) {
                // 向前对比
                for (int j = i; j >= k; j -= k) {
                    if (nums[j - k] > nums[j]) {
                        int temp = nums[j - k];
                        nums[j - k] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 6, 3, 8, 7, 2};
        new shellSort().Shell_Sort(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
