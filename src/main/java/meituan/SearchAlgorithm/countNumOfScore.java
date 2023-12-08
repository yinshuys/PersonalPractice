package meituan.SearchAlgorithm;

/**
 * 某班级考试成绩按非严格递增顺序记录于整数数组 scores，
 * 请返回目标成绩 target 的出现次数。
 */
public class countNumOfScore {

    //二分查找复杂版
    public int countTarget(int[] scores, int target) {
        int left = 0, right = scores.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (scores[mid] == target) {
                int tmp = mid + 1;
                if (left == right) return 1;
                while (tmp <= right && scores[tmp] == target) {
                    tmp++;
                    count++;
                }
                while (mid >= left && scores[mid] == target) {
                    mid--;
                    count++;
                }
                return count;
            } else if (scores[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    public int countTarget1(int[] scores, int target) {
        return helper(scores, target) - helper(scores, target - 1);
    }

    int helper(int[] scores, int tar) {
        int i = 0, j = scores.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            //如果找到比target小或等于target等会向前移动，直到右边界
            if (scores[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
