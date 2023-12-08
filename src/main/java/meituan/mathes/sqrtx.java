package meituan.mathes;

public class sqrtx {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int res = (int) Math.exp(0.5 * Math.log(x));
        return (long) (res + 1) * (res + 1) <= x ? res + 1 : res;
    }

    public int mySqrt1(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                r = mid + 1;
                r = mid - 1;
            }
        }
        return ans;
    }
}
