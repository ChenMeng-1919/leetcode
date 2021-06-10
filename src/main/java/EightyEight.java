import java.util.Arrays;

/*
 * @author: cm
 * @date: Created in 2021/6/10 10:31
 * @description:合并两个有序数组
 */

public class EightyEight {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        EightyEight.merge(nums1, 3, nums2, 3);
    }


    /**
     * @description:自己完成的方法
     * @Param: [nums1, m, nums2, n]
     * @Return: void
     * @Date: 2021/6/10 13:35
     */
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

    /**
     * @description:方法一：直接合并后排序。
     * @Param: [nums1, m, nums2, n]
     * @Return: void
     * @Date: 2021/6/10 13:29
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /**
     * @description:方法二：双指针
     * @Param: [nums1, m, nums2, n]
     * @Return: void
     * @Date: 2021/6/10 13:33
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }

    /**
     * @description:方法三：逆向双指针
     * @Param: [nums1, m, nums2, n]
     * @Return: void
     * @Date: 2021/6/10 13:35
     */
    void merge3(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }

    }
}
