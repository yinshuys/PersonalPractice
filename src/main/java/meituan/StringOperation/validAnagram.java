package meituan.StringOperation;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 */
public class validAnagram {

    public validAnagram(){};

    /**
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) return true;
        if (s.length() != t.length()) return false;
        int len = s.length();
        int[] s_abc = new int[36];
        int[] t_abc = new int[36];
        for (int i = 0; i < len; i++) {
            int index_s = s.charAt(i) - 'a';
            s_abc[index_s]++;
            int index_t = t.charAt(i) - 'a';
            t_abc[index_t]++;
        }
        for (int j = 0; j < 36; j++) {
            if (s_abc[j] != t_abc[j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "",t="";
        new validAnagram().isAnagram(s,t);
    }
}
