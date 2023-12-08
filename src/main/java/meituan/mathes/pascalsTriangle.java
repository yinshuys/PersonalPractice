package meituan.mathes;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class pascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new LinkedList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) list.add(1);
                else {
                    List<Integer> tmp = ans.get(i - 2);
                    list.add(tmp.get(j - 1) + tmp.get(j - 2));
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
