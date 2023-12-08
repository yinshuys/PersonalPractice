package meituan;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public int findMajorElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * 投票
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int x = 0, vote = 0;
        for (int num : nums) {
            if (vote == 0) x = num;
            vote += x == num ? 1 : -1;
        }
        return x;
    }
}
