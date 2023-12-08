package meituan.leftAndRight;

public class dataClassification {
    //左右指针，但是复杂
    public int[] trainingPlan(int[] actions) {
        int left = 0, right = actions.length - 1;
        //不能是等号
        while (left < right) {
            if (actions[left] % 2 == 0) {
                //一定是left < right
                while (left < right && actions[right] % 2 == 0) {
                    right--;
                }
                swap(actions, left++, right--);
            } else left++;
        }
        return actions;
    }

    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    //参考答案
    public int[] trainingPlan1(int[] actions) {
        int i = 0, j = actions.length - 1, tmp;
        while (i < j) {
            while (i < j && (actions[i] & 1) == 1) i++;
            while (i < j && (actions[j] & 1) == 0) j--;
            tmp = actions[i];
            actions[i] = actions[j];
            actions[j] = tmp;
        }
        return actions;
    }
}
