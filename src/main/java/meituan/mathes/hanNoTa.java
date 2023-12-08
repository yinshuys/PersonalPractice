package meituan.mathes;

import java.util.List;

/**
 * 在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只能放在更大的盘子上面)。移动圆盘时受到以下限制:
 * (1) 每次只能移动一个盘子;
 * (2) 盘子只能从柱子顶端滑出移到下一根柱子;
 * (3) 盘子只能叠在比它大的盘子上。
 * 请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。
 * 你需要原地修改栈。
 */
public class hanNoTa {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        movePlant(A.size(), A, B, C);
    }

    public void movePlant(int size, List<Integer> start, List<Integer> auxiliary, List<Integer> target) {
        //最后一个盘子直接放到目标柱子
        if (size == 1) {
            target.add(start.get(start.size() - 1));
            return;
        }
        // 不到最后一个盘子，暂时先把盘子放到临时柱子
        movePlant(size - 1, start, target, auxiliary);
        auxiliary.add(start.remove(start.size() - 1));
        // 再从临时柱子转移到目标柱子
        movePlant(size - 1, auxiliary, start, target);
    }
}
