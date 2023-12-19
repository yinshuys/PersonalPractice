package meituan.SearchAlgorithm;

public class Bubble {
    /**
     * 冒泡排序
     * @param nums
     */
    public void BubbleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) break; //要是标志为true，说明没有再进入if语句了，则排序已经完成
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8, 5, 6, 1, 8, 4, 9, 2};
        new Bubble().BubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
