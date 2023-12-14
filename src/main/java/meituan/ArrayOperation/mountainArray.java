package meituan.ArrayOperation;

/**
 * 符合下列属性的数组 arr 称为 山脉数组 ：
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给你由整数组成的山脉数组 arr ，
 * 返回满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
 * 你必须设计并实现时间复杂度为 O(log(n)) 的解决方案。
 */
public class mountainArray {
    /**
     * 二分查找
     * @param arr
     * @return
     */
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int ans = 0, left = 0, right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;//山顶坐标
    }
}
