package meituan.binaryArithmetic;

/**
 * 给定一个二维数组 array，请返回「螺旋遍历」该数组的结果。
 * 螺旋遍历：从左上角开始，按照 向右、向下、向左、向上 的顺序 依次 提取元素，
 * 然后再进入内部一层重复相同的步骤，直到提取完所有元素。
 */
public class SquareTraversal {
    public int[] spiralArray(int[][] array) {
        if (array.length ==0 )return new int[0];
        int left = 0, top = 0, right = array[0].length - 1, bottom = array.length - 1;
        int[] res = new int[(right + 1) * (bottom + 1)];
        int x = 0;
        while (true) {
            // 向右
            for (int i = left; i <= right; i++) {
                res[x++] = array[top][i];
            }
            top++;
            if (top > bottom) break;
            // 向下
            for (int i = top; i <= bottom; i++) {
                res[x++] = array[i][right];
            }
            right--;
            if (right < left) break;
            // 向左
            for (int i = right; i >= left; i--) {
                res[x++] = array[bottom][i];
            }
            bottom--;
            if (bottom < top) break;
            // 向上
            for (int i = bottom; i >= top; i--) {
                res[x++] = array[i][left];
            }
            left++;
            if (left > right) break;
        }
        return res;
    }
}
