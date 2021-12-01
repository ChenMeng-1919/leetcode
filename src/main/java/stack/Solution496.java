package stack;

/**
 * @author: cm
 * @since: Created in 2021/12/1 19:03
 * @description:
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i = 0;
        int[] nums3 = new int[nums1.length];
        for (int nums : nums1) {
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if (nums == nums2[i1]) {
                    if (nums2[i1 + 1] > nums) {
                        nums3[i++] = nums;
                    } else {
                        nums3[i++] = -1;
                    }
                }
            }
        }
        return nums3;
    }
}

