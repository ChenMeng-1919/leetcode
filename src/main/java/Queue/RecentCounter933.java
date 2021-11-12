package Queue;

import java.util.ArrayList;

/*
 * @author: cm
 * @date: Created in 2021/11/11 17:59
 * @description:
 */
public class RecentCounter933 {

    ArrayList<Integer> callList;

    public RecentCounter933() {
        this.callList = new ArrayList<>();
    }

    public int ping(int t) {
        int count = 0;
        callList.add(t);
        for (Integer integer : callList) {
            if (t - integer <= 3000) {
                count++;
            }
        }

        return count;
    }
}
