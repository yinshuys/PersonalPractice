package meituan;

import java.util.Arrays;

public class twoArrayMerge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1, q = n - 1;
        int tail = m + n - 1; // 倒着填数
        while (p >= 0 || q >= 0) {
            if (p == -1) {
                nums1[tail] = nums2[q--];
            } else if (q == -1) {
                nums1[tail] = nums1[p--];
            } else if (p == -1) {
                nums1[tail] = nums2[q--];
            } else if (nums1[p] > nums2[q]) {
                nums1[tail] = nums1[p--];
            } else {
                nums1[tail] = nums2[q--];
            }
            tail--;
        }
    }
}
