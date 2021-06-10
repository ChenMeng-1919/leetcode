/*
 * @author: cm
 * @date: Created in 2021/6/9 11:51
 * @description:寻找两个正序数组的中位数
 */
public class Four {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        Four solution = new Four();
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int len;
        int len2;
        int[] a = new int[length1 + length2];
        int j = 0;
        int k = 0;
        int l = 0;
        if (length1 > length2) {
            len = length2;
            len2 = length1;
        } else {
            len = length1;
            len2 = length2;
        }

        while (j != length1 && k != length2) {
            if (nums1[j] > nums2[k]) {
                a[l++] = nums2[k++];
            } else if (nums1[j] == nums2[k]) {
                a[l++] = nums2[k++];
            } else {
                a[l++] = nums1[j++];
            }
        }
        if (nums1.length != j) {
            for (int i = j; i < length1; i++) {
                a[l++] = nums1[i];
            }
        } else {
            for (int i = k; i < length2; i++) {
                a[l++] = nums2[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        if (l == 0) {
            return 0.0;
        }
        if (l % 2 == 1) {
            return a[(l + 1) / 2 - 1];
        } else {
            return ((double) (a[l / 2 - 1] + a[(l / 2)])) / 2;
        }
    }
}
