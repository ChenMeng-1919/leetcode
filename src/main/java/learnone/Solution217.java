package learnone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @author: cm
 * @date: Created in 2021/11/30 20:26
 * @description:
 */
public class Solution217 {
    /**
     * 自定义题解
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numberSet = new HashSet<>();
        for (int num : nums) {
            numberSet.add(num);
        }
        return numberSet.size() != nums.length;
    }

    /**
     * 官方题解1利用哈希表
     */
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
    /**
     * 官方题解2利用排序
     */
    public boolean containsDuplicate3(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
