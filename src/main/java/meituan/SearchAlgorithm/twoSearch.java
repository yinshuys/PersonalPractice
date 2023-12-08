package meituan.SearchAlgorithm;

public class twoSearch {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                left = mid;
            } else{
                right = mid;
            }
        }
        return -1;
    }
}
