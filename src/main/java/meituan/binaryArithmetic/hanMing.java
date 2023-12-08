package meituan.binaryArithmetic;

public class hanMing {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        // while条件只能是不等于
        while (n != 0) {
            ans += n & 1;
            n >>>= 1;
        }
        return ans;
    }
}
