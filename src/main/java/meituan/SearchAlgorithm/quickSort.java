package meituan.SearchAlgorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 给你一个整数数组 nums，请你将该数组升序排列
 */
public class quickSort {
    /**
     * 直接使用内置函数
     *
     * @param nums 数组
     * @return 原数组排序后
     */
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    /**
     * 快排
     *
     * @param nums 数组
     * @return
     */
    public int[] sortArray1(int[] nums) {
        quick_Sort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quick_Sort(int[] nums, int left, int right) {
        if (left < right) {
            int pivotIndex = Partition(nums, left, right);
            quick_Sort(nums, left, pivotIndex - 1);
            quick_Sort(nums, pivotIndex, right);
        }
    }

    public int Partition(int[] nums, int left, int right) {
        if (left == right) return left;
        // 从left和right中找到一个随机下标
        int pivot = new Random().nextInt(right - left + 1) + left;
        swap(nums, pivot, right); // 作为基准的值放到数组最后一个
        // 从第一个开始比较
        int small_index = left; // 是第一个没交换的值的下标
        for (int i = small_index; i < right; i++) {
            if (nums[i] < nums[right]) { // nums[right]就是基准的值
                swap(nums, i, small_index); // 将小的值往前移动
                small_index++;
            }
        }
        swap(nums, small_index, right); // 循环之后比right上的值大的位置都没变，说明right上的值最小
        return small_index;  // 可以确定small_index右边的值比其小，左边的值比其大
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 6, 3, 8, 7, 2};
        new quickSort().sortArray1(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

}
