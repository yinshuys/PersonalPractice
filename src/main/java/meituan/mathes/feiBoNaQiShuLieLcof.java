package meituan.mathes;

/**
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 */
public class feiBoNaQiShuLieLcof {
    public int fib(int n) {
        int sum = 0, a = 0, b = 1;
        if (n == 0 || n == 1) return n;
        for (int i = 1; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }

        return sum;
    }
}
