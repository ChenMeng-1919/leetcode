import java.util.HashSet;
import java.util.Set;

/*
 * @author: cm
 * @date: Created in 2021/6/11 9:34
 * @description:剑指 Offer 03. 数组中重复的数字
 */
public class j03 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        j03.findRepeatNumber(nums);
    }

    /**
     * @description:官方解法
     * @Param: [nums]
     * @Return: int
     * @Date: 2021/6/11 9:43
     */
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static int findRepeatNumber1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] == nums[i1]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
