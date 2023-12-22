package meituan.StringOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串s，请你找出其中不含有重复字符的最长子串的长度。
 */
public class longestSubWithoutRepeatingCharacters {
    /**
     * 滑动窗口
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                // 决定滑动窗口的大小
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
