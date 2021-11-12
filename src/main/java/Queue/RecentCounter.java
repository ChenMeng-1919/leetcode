package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @author: cm
 * @date: Created in 2021/11/12 10:11
 * @description:
 */
public class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }

}
