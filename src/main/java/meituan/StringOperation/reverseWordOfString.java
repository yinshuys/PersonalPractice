package meituan.StringOperation;


public class reverseWordOfString {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String[] res = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            StringBuffer tmp = new StringBuffer(strs[i]).reverse();
            res[i] = tmp.toString();
        }
        return String.join(" ", res);
    }
}
