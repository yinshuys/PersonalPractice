package meituan.StringOperation;

public class twoStringAdd {

    //这种方法会受到大数影响
    public String addStrings(String num1, String num2) {
        int num01 = Integer.parseInt(num1);
        int num02 = Integer.parseInt(num2);
        int sum = num01 + num02;
        return String.valueOf(sum);
    }

    public String addStrings1(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int len1 = num1.length() - 1, len2 = num2.length() - 1, carry = 0;
        while (len1 >= 0 || len2 >= 0) {
            int n = len1 >= 0 ? (num1.charAt(len1) - '0') : 0;
            int m = len2 >= 0 ? (num2.charAt(len2) - '0') : 0;
            int tmp = n + m + carry;
            carry = tmp / 10;
            res.append(tmp % 10);
            len1--;
            len2--;
        }
        if (carry == 1) res.append(1);
        return res.reverse().toString();
    }
}
