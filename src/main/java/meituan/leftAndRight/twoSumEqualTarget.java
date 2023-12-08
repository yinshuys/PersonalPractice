package meituan.leftAndRight;

/**
 * 购物车内的商品价格按照升序记录于数组 price。
 * 请在购物车中找到两个商品的价格总和刚好是 target。
 * 若存在多种情况，返回任一结果即可。
 */
public class twoSumEqualTarget {
    /**
     * 左右指针
     *
     * @param price
     * @param target
     * @return
     */
    public int[] twoSum(int[] price, int target) {
        int left = 0, right = price.length - 1;
        while (left < right) {
            int sum = price[left] + price[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{price[left], price[right]};
            }
        }
        return new int[0];
    }
}
