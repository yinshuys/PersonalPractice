package meituan.StringOperation;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 */
public class compressStringLcci {
    /**
     * 左右指针
     * @param S
     * @return
     */
    public String compressString(String S) {
        int len = S.length();
        if (len <= 1) return S;
        int left = 0, right = left + 1;
        int index = 1;
        StringBuffer ans = new StringBuffer();
        ans.append(S.charAt(left));
        while (right < len) {
            if (S.charAt(left) == S.charAt(right)) {
                index++;
                right++;
            } else {
                ans.append(index);
                index = 1;
                ans.append(S.charAt(right));
                left = right;
                right++;
            }
        }
        ans.append(index);
        String res = ans.toString();
        return res.length() < len ? res : S;
    }

    public static void main(String[] args) {
        String str = "aabcccccaa";
        System.out.println(new compressStringLcci().compressString(str));
    }
}
