/*
 * @author: cm
 * @date: Created in 2021/6/10 10:31
 * @description:合并两个有序数组
 */
public class EightyEight {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        EightyEight.merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int[] a = new int[m + n];
        while (p1 != m && p2 != n) {
            if (nums1[p1] >= nums2[p2]) {
                a[p3++] = nums2[p2++];
            } else {
                a[p3++] = nums1[p1++];
            }
        }
        if (m != p1) {
            for (int i = p1; i < m; i++) {
                a[p3++] = nums1[i];
            }
        } else {
            for (int i = p2; i < n; i++) {
                a[p3++] = nums2[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        nums1 = a;
        for (int i = 0; i < m + n; i++) {
            nums1[i] = a[i];
        }
    }
}
