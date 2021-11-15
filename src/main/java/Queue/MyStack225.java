package Queue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/*
 * @author: cm
 * @date: Created in 2021/11/15 9:38
 * @description:
 */
public class MyStack225 {
    Queue<Integer> c;
    Queue<Integer> m;

    public MyStack225() {
        this.c = new LinkedList<>();
        this.m = new LinkedList<>();

    }

    public void push(int x) {
        c.offer(x);
        while (Objects.nonNull(m.peek())) {
            Integer poll = m.poll();
            c.offer(poll);
        }
        m.addAll(c);
        c.clear();
    }

    public int pop() {
        return m.poll();
    }

    public int top() {
        return m.peek();
    }

    public boolean empty() {
        return m.size() == 0;
    }
}
