import java.util.HashMap;
import java.util.Map;

/*
 * @author: cm
 * @date: Created in 2021/4/12 16:04
 * @description:两数之和
 */
public class One {
    public static void main(String[] args) {
        int[] c = {1,3,4,2};
        int d = 6;
        One test = new One();
        int[] ints = test.twoSum(c, d);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }


    /**
     * @description:自定义
     * @Param: [nums, target]
     * @Return: int[]
     * @Date: 2021/6/10 14:10
     */
    public int[] twoSum(int[] nums, int target) {
        int[] a;
        int i = 0;
        int length = nums.length;
        for (int i1 = 0; i1 < length - 1; i1++) {
            for (int i2 = length - 1; i2 > i1; i2--) {
                if (nums[i1] + nums[i2] == target) {
                    return a = new int[]{i1, i2};
                }
            }
        }
        return nums;
    }

    /**
     * @description:方法一：暴力枚举
     * @Param: [nums, target]
     * @Return: int[]
     * @Date: 2021/6/10 14:10
     */
    public int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


    /**
     * @description:方法二：哈希表
     * @Param: [nums, target]
     * @Return: int[]
     * @Date: 2021/6/10 14:11
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
