package meituan.mathes;

/**
 * 给定一个整数 n ，返回 n! 结果中尾随零的数量。
 */
public class factorialTrailingZeroes {
    /**
     * 暴力，错误实例
     *
     * @param n 阶数
     * @return
     */
    public int trailingZeroes(int n) {
        int ans = 1, count = 0;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }// 大数警告
        while (ans % 10 == 0 && ans > 0) {
            count++;
            ans /= 10;
        }
        return count;
    }

    public int trailingZeroes1(int n) {
        int ans = 0;
        // 求n尾数为0的个数，就是找10的倍数的个数，也是2或者5倍数的最小值。
        // n/5，表示有n/5个倍数，比如130是5的26倍，说明1*5，2*5...25*5，26*5都包含在n！中
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }

}
