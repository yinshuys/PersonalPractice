package meituan.leftAndRight;

import java.util.Arrays;

public class stockManagementIII {
    public int[] inventoryManagement(int[] stock, int cnt) {
        Arrays.sort(stock);
        int[] res = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            res[i] = stock[i];
        }
        return res;
    }

    public int[] inventoryManagement1(int[] stock, int cnt) {
        quickSort(stock, 0, stock.length - 1);
        return Arrays.copyOf(stock, cnt);
    }

    public void quickSort(int[] nums, int left, int right) {
        // 子数组长度为 1 时终止递归
        if (left >= right) return;
        // 哨兵划分操作（以 stock[l] 作为基准数）
        int i = left, j = right;
        while (i < j) {
            while (i < j && nums[j] >= nums[left]) j--;
            while (i < j && nums[i] <= nums[left]) i++;
            swap(nums, i, j);
        }
        swap(nums, i, left);
        // 递归左（右）子数组执行哨兵划分
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }

    public void swap(int[] nums, int m, int n) {
        int tmp = nums[m];
        nums[m] = nums[n];
        nums[n] = tmp;
    }
}
