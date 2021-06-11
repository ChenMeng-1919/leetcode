import java.util.ArrayList;
import java.util.List;

/*
 * @author: cm
 * @date: Created in 2021/6/10 14:59
 * @description:三数之和
 */
public class Fifteen {


    public static void main(String[] args) {
        int[] nums = {0,3,0,1,1,-1,-5,-5,3,-3,-3,0};
        List<List<Integer>> lists = Fifteen.threeSum(nums);

    }

    /**
     * @description:自定义
     * @Param: [nums]
     * @Return: java.util.List<java.util.List < java.lang.Integer>>
     * @Date: 2021/6/10 15:00
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int i2 = i + 1; i2 < nums.length; i2++) {
                for (int i3 = i2 + 1; i3 < nums.length; i3++) {
                    if (nums[i2] + nums[i3] + nums[i] == 0) {
                        List<Integer> list1 = new ArrayList<>();
                        if (list.size() == 0) {
                            list1.add(nums[i2]);
                            list1.add(nums[i3]);
                            list1.add(nums[i]);
                            list.add(list1);
                        } else {
                            //每次判断一个数组
                            int x = 0;
                            for (int i4 = 0; i4 < list.size(); i4++) {
                                for (int i5 = 0; i5 < list.get(i4).size(); i5++) {
                                    if (!(list.get(i4).get(i5) == nums[i] || list.get(i4).get(i5) == nums[i2] || list.get(i4).get(i5) == nums[i3])) {
                                        x++;
                                        break;
                                    }
                                }

                            }
                            if (x == list.size()) {
                                list1.add(nums[i2]);
                                list1.add(nums[i3]);
                                list1.add(nums[i]);
                                list.add(list1);
                            }
                        }
                    }
                }

            }
        }
        return list;
    }
}
