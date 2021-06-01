/*
 * @author: cm
 * @date: Created in 2021/4/12 16:04
 * @description:
 */
public class twoSum {
    public static void main(String[] args) {
        int[] c = {1,3,4,2};
        int d = 6;
        twoSum test = new twoSum();
        int[] ints = test.twoSum(c, d);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

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
}
