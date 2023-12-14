package meituan.StringOperation;

/**
 * 给你两个字符串 haystack 和 needle ，
 * 请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 * 如果 needle 不是 haystack 的一部分，则返回  -1 。
 */
public class findString {
    /**
     * 双指针
     *
     * @param haystack 目标字符串
     * @param needle   预匹配字符串
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;
        int len_h = haystack.length(), len_n = needle.length();
        if (len_h == len_n) return 0;
        int h = 0, n = 0, index = 0;
        while (h < len_h && n < len_n) {
            while (h < len_h && n < len_n && haystack.charAt(h) == needle.charAt(n)) {
                if (n == 0) index = h;
                n++;
                h++;
            }
            if (n == len_n) return index;//当n=needle的长度，表示完全匹配，能够直接输出index
            else if (n > 0) {//表示未能完全匹配的字符串，h指针需要回退到index的下一个位置
                n = 0;
                h = index + 1;
            } else // n=0，表示没有开始匹配
                h++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(new findString().strStr(haystack, needle));
    }

    /**
     * KMP算法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr_kmp(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

}
