package meituan.mathes;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角指定行元素
 */
public class pascalsTriangleII {
    /**
     * 计算每一行的输出
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
     List<Integer> pre = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                }else {
                    cur.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return pre;
    }
}
