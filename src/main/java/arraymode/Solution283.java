package arraymode;

/*
 * @author: cm
 * @date: Created in 2021/9/1 13:23
 * @description:283. 移动零
 */
public class Solution283 {
    /**
     * @description: 自定义方法
     * @Param: [nums]
     * @Return: void
     * @Date: 2021/9/15 18:11
     */
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int code = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[code] = nums[i];
                if (i != code++) {
                    nums[i] = 0;
                }
            }
        }
    }

    /**
     * @description: 力扣官方题解
     * @Param: [nums]
     * @Return: void
     * @Date: 2021/9/15 18:11
     */
    public void moveZeroesGF(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
