/*
 * @author: cm
 * @date: Created in 2021/6/23 15:43
 * @description:旋转数组。
 */
public class OneHundredAndEightyNine {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        OneHundredAndEightyNine.rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        int[] a = new int[k];
        int l = 0;
        for (int length = nums.length - k; length < nums.length; length++) {
            a[l++] = nums[length];
        }
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = a[i];
        }
    }
}
