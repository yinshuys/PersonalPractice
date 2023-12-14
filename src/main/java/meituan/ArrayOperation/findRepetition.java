package meituan.ArrayOperation;

import java.util.Arrays;

/**
 * 设备中存有 n 个文件，文件 id 记于数组 documents。
 * 若文件 id 相同，则定义为该文件存在副本。请返回任一存在副本的文件 id。
 */
public class findRepetition {
    public int findRepeatDocument(int[] documents) {
        Arrays.sort(documents);
        int pre = 0, cur = pre + 1;
        if (documents.length <= 1) return -1;
        while (cur < documents.length) {
            if (documents[pre] == documents[cur]) {
                return documents[pre];
            }
            pre++;
            cur++;
        }
        return -1;
    }
}
