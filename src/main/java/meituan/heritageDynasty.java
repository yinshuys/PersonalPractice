package meituan;

import java.util.Arrays;

/**
 * 展览馆展出来自 13 个朝代的文物，每排展柜展出 5 个文物。
 * 某排文物的摆放情况记录于数组 places，
 * 其中 places[i] 表示处于第 i 位文物的所属朝代编号。
 * 其中，编号为 0 的朝代表示未知朝代。
 * 请判断并返回这排文物的所属朝代编号是否连续（如遇未知朝代可算作连续情况）。
 */
public class heritageDynasty {
    public boolean checkDynasty(int[] places) {
        int zero = 0;
        int count = 0;
        Arrays.sort(places);
        for (int i = 0; i < places.length - 1; i++) {
            if (places[i] == 0) zero++; //0是替补位，可以是任何数字
            else {
                if (places[i] == places[i + 1]) return false; //顺子不包括重复
                //计算替补位剩余
                if (places[i] != places[i + 1] - 1) count += places[i + 1] - places[i] - 1;
            }
        }
        if (count <= zero) return true;
        else return false;
    }
}
