package meituan.binaryArithmetic;

/**
 * 给定一个字符串 s，统计并返回具有相同数量 0 和 1 的非空（连续）子字符串的数量，
 * 并且这些子字符串中的所有 0 和所有 1 都是成组连续的。
 * 重复出现（不同位置）的子串也要统计它们出现的次数。
 */
public class countBinarySubstrings0 {
    /**
     * 按照字符分类
     * @param s
     * @return
     */
    public int countBinarySubstrings(String s) {
        int pre = 0, last = 0, ans = 0, n = s.length();
        while (pre < n) {
            char c = s.charAt(pre);
            int count = 0;
            while (pre < n && s.charAt(pre) == c) {
                pre++;
                count++;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }
}
