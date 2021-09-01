/*
 * @author: cm
 * @date: Created in 2021/6/18 17:01
 * @description:121. 买卖股票的最佳时机
 */
public class OneHundredTwentyOne {


    /**
     * @description:暴力破解法
     * @Param: [prices]
     * @Return: int
     * @Date: 2021/6/18 17:10
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int i1 = i + 1; i1 < prices.length; i1++) {
                if (prices[i1] - prices[i] > max) {
                    max = prices[i1] - prices[i];
                }
            }
        }
        if (max > 0) {
            return max;
        } else {
            return 0;
        }
    }

    /**
     * @description:优化方法1
     * @Param: [prices]
     * @Return: int
     * @Date: 2021/6/18 17:13
     */
    public int maxProfit1(int[] prices) {
        int p1 = 0;
        int p2 = 0;
        int max = 0;
        boolean flag = false;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1 && flag == true) {
                if (prices[prices.length - 1] - prices[p1] > max) {
                    max = prices[prices.length - 1] - prices[p1];
                }
            } else if (i != prices.length - 1 && prices[i + 1] - prices[i] > 0 && flag == false) {
                flag = true;
                p1 = i;
            } else if (i != prices.length - 1 && prices[i + 1] - prices[i] < 0 && flag == true) {
                {
                    flag = false;
                    p2 = i;
                    if (prices[p2] - prices[p1] > max)
                        max = prices[p2] - prices[p1];
                }
            }
        }
        return max;
    }
}
