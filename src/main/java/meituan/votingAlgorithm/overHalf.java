package meituan.votingAlgorithm;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.*;

/**
 * 仓库管理员以数组 stock 形式记录商品库存表。
 * stock[i] 表示商品 id，可能存在重复。
 * 请返回库存表中数量大于 stock.length / 2 的商品 id。
 */
public class overHalf {
    public int inventoryManagement(int[] stock) {
        /**
         * 借助哈希表
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : stock) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int len = stock.length;
        for (Entry entry : map.entrySet()) {
            int tmp = (int) entry.getValue();
            if (tmp > len / 2) return (int) entry.getKey();
        }
        return -1;
    }

    public int inventoryManagementI(int[] stock) {
        int vote = 0, x = 0, len = stock.length, count = 0;
        for (int num : stock) {
            if (vote == 0) x = num;
            vote += num == x ? 1 : -1;
        }
        //验证
        for (int num : stock) {
            if (x == num) count++;
        }
        return count > len / 2 ? x : 0;
    }

}
