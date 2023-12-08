package meituan;

public class reverseInteger {
    /**
     * 没有考虑x的取值范围
     * 如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。
     * @param x
     * @return
     */
    public int reverseNum(int x){
        int num = Math.abs(x);
        int res = 0;
        while (num > 0){
            if ( res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = num % 10;
            num /= 10;
            res = res * 10 + digit;
        }
        if (x < 0) return -res;
        else return res;
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            //判断大数
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
