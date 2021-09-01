package ElementaryAlgorithm;

/*
 * @author: cm
 * @date: Created in 2021/6/17 17:30
 * @description:买卖股票的最佳时机 II
 */
public class Two {

    public static void main(String[] args) {
        int[] prices = {6, 1, 3, 2, 4, 7};
        int i = Two.maxProfit(prices);
        System.out.println(i);
    }

    /**
     * @description:自定义方法
     * @Param: [prices]
     * @Return: int
     * @Date: 2021/6/18 17:02
     */
    public static int maxProfit(int[] prices) {
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1 && flag == true) {
                sum += prices[prices.length - 1] - prices[p1];
            } else if (i != prices.length - 1 && prices[i + 1] - prices[i] > 0 && flag == false) {
                flag = true;
                p1 = i;
            } else if (i != prices.length - 1 && prices[i + 1] - prices[i] < 0 && flag == true) {
                {
                    flag = false;
                    p2 = i;
                    sum += prices[p2] - prices[p1];
                }
            }
        }
        return sum;
    }
}
