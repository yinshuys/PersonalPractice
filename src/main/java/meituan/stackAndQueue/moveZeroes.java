package meituan.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
 * 同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class moveZeroes {
    /**
     * 使用队列，先进先出
     *
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                queue.offer(i);
            } else {
                if (!queue.isEmpty()) {
                    swap(nums, queue.poll(), i);
                    queue.offer(i); //交换后i的位置也为0，其后还会出现非零元素
                }
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /**
     * 双指针
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        if (nums == null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }

}
