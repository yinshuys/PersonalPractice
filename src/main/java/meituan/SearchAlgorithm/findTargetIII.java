package meituan.SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件组合
 * 待传输文件被切分成多个部分，按照原排列顺序，每部分文件编号均为一个 正整数（至少含有两个文件）。
 * 传输要求为：连续文件编号总和为接收方指定数字 target 的所有文件。请返回所有符合该要求的文件传输组合列表。
 * 注意，返回时需遵循以下规则：
 * 每种组合按照文件编号 升序 排列；
 * 不同组合按照第一个文件编号 升序 排列。
 */
public class findTargetIII {
    /**
     * 滑动窗口
     *
     * @param target 目标
     * @return 和为Target的组合
     */
    public int[][] fileCombination(int target) {
        int pre = 1, cur = 2, s = 3;
        List<int[]> ans = new ArrayList<>();
        while (pre < cur) {
            if (s == target) {
                int[] tmp = new int[cur - pre + 1];
                for (int i = 0; i <= cur - pre; i++) {
                    tmp[i] = pre + i;
                }
                ans.add(tmp);
            }
            // 不能用else if且需要等号，不然不能继续查找
            if (s >= target) {
                s -= pre;
                pre++;
            } else {
                cur++;
                s += cur;
            }
        }
        return ans.toArray(new int[0][]);
    }
}
