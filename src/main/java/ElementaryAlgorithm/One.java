package ElementaryAlgorithm;

/*
 * @author: cm
 * @date: Created in 2021/6/17 11:35
 * @description:删除排序数组中的重复项。
 */
public class One {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        One.removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        //或者等价于p1!=nums.length&&p2 != nums.length
        while (p2 != nums.length) {
            if (nums[p1] == nums[p2]) {
                p2++;
            } else {
                nums[++p1] = nums[p2++];
            }
        }
        return p1;
    }
}
