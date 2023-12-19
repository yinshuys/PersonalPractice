package meituan.SearchAlgorithm;

public class selectSort {
    /**
     * 选择排序
     * @param nums
     */
    public void select_Sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i;
            // 找到后排最小的元素下标
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[left] > nums[j]) {
                    left = j;
                }
            }
            // 放到前面
            if (i != left) {
                int tmp = nums[left];
                nums[left] = nums[i];
                nums[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9, 5, 1, 6, 0, 2, 4, 3};
        new selectSort().select_Sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
