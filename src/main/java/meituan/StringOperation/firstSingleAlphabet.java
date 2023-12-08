package meituan.StringOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * 某套连招动作记作仅由小写字母组成的序列 arr，其中 arr[i] 第 i 个招式的名字。
 * 请返回第一个只出现一次的招式名称，如不存在请返回空格。
 */
public class firstSingleAlphabet {
    public char dismantlingAction(String arr) {
        int len = arr.length();
        if (len == 0) return ' ';
        else if (len == 1) return arr.charAt(0);
        int count = 1;
        char res = arr.charAt(0);
        for (int i = 1; i < len; i++) {
            if (res == arr.charAt(i)) {
                count++;
            } else if (count == 1) {
                return res;
            } else {
                count = 1;
                res = arr.charAt(i);
            }
        }
        return ' ';
    }

    /**
     * 连招不代表会连续出现。
     * @param arr
     * @return
     */
    public char dismantlingAction1(String arr) {
        Map<Character, Boolean> map = new HashMap<>();
        for (char c : arr.toCharArray()) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : arr.toCharArray()) {
            if (map.get(c)) return c;
        }
        return ' ';
    }

}
