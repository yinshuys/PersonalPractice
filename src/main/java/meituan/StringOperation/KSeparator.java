package meituan.StringOperation;

/**
 * 给你一个整数 n，请你每隔三位添加点（即 "." 符号）作为千位分隔符，
 * 并将结果以字符串格式返回。
 */
public class KSeparator {
    /**
     * 暴力，从头开始
     *
     * @param n
     * @return
     */
    public String thousandSeparator(int n) {
        String num = String.valueOf(n);
        int len = num.length();
        if (len <= 3) return num;
        int last = len % 3;
        StringBuffer res = new StringBuffer();
        int size = 0;
        if (last != 0) {
            for (int i = 0; i < last; i++) {
                res.append(num.charAt(i));
            }
            res.append('.');
        }
        for (int j = last; j < len; j++) {
            res.append(num.charAt(j));
            size++;
            if (size % 3 == 0) {
                res.append('.');
            }
        }
        return res.toString().substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        int n = 1234;
        String res = new KSeparator().thousandSeparator(n);
        System.out.println(res);
    }

    /**
     * 从尾开始，最后反转
     * @param n
     * @return
     */
    public String KsSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(n);
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
            cnt++;
            // 如果cnt%3==0，并且i!=0(不是最后一个字符)
            if (cnt % 3 == 0 && i != 0) {
                sb.append(".");
            }
        }
        return sb.reverse().toString();
    }

}
