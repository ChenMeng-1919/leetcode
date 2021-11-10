package arraymode;

/*
 * @author: cm
 * @date: Created in 2021/9/15 18:53
 * @description:27、移除元素
 */
public class Solution27 {
    /**
     * @description: 自定义解法
     * @Param: [nums, val]
     * @Return: int
     * @Date: 2021/9/15 18:53
     */
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int code = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[code++] = nums[i];
            }
        }
        return code;
    }

    /**
     * @description: 官方题解
     * @Param: [nums, val]
     * @Return: int
     * @Date: 2021/9/15 18:55
     */
    public int removeElementGF(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }


}
