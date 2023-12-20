package meituan.SearchAlgorithm;

public class InsertSort {
    /**
     * 插入排序
     * @param nums
     */
    public void InsertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // 将要插入的元素
            int cur = nums[i];
            int preIndex = i;
            // 向前对已经排序的元素一一对比，且替换
            while (preIndex > 0 && cur < nums[preIndex - 1]) {
                nums[preIndex] = nums[preIndex - 1]; // 相当于把较大的移动到后面了
                preIndex--;
            }
            if (preIndex != i) {
                nums[preIndex] = cur; // 插入到找到的合适位置
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 6, 3, 8, 7, 2};
        new InsertSort().InsertionSort(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
