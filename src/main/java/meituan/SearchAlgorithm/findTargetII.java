package meituan.SearchAlgorithm;

/**
 * m*n 的二维数组 plants 记录了园林景观的植物排布情况，具有以下特性：
 * 每行中，每棵植物的右侧相邻植物不矮于该植物；
 * 每列中，每棵植物的下侧相邻植物不矮于该植物。
 */
public class findTargetII {
    /**
     * 每行遍历，利用二分查找target
     *
     * @param plants
     * @param target
     * @return
     */
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        int lines = plants.length;
        int index = 0;
        while (index < lines && !Search(plants[index], target)) {
            index++;
        }
        return index != lines;
    }

    public boolean Search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean findTargetIn2DPlantsII(int[][] plants, int target) {
        int len = plants.length;
        int i = len - 1, j = 0;
        while (i > 0 && j < len) {
            if (plants[i][j] == target) return true;
            else if (plants[i][j] > target) i--;
            else j++;
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] plans = new int[1][1];
        plans[0][0] = -5;
        System.out.println(new findTargetII().findTargetIn2DPlants(plans, -5));
    }
}
