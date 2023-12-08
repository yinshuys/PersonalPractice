package meituan.SearchAlgorithm;

/**
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，
 * 请你从数组中找出满足相加之和等于目标数 target 的两个数。
 * 如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 * 你所设计的解决方案必须只使用常量级的额外空间。
 */
public class twoSumEqualTarget {
    /**
     * 二分法查找
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int index = 0, len = numbers.length;
        while (index < len &&
                TwoSearch(numbers, index + 1, len - 1, target - numbers[index]) == -1 ||
                TwoSearch(numbers, index + 1, len - 1, target - numbers[index]) == index
        ) {
            index++;
        }
        return new int[]{index + 1, TwoSearch(numbers, index + 1, len - 1, target - numbers[index]) + 1};
    }

    public int TwoSearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] text = new int[]{1, 2, 3, 4, 4, 9, 56, 90};
        int[] res = new twoSumEqualTarget().twoSum(text, 8);
        System.out.println(res[0] + "," + res[1]);
    }

    /**
     * 左右指针
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum1(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int s = numbers[left] + numbers[right];
            if (s == target) return new int[]{left, right};
            else if (s > target) right--;
            else left++;
        }
        return new int[]{left, right};
    }
}
