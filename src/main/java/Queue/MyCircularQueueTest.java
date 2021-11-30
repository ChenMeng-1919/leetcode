package Queue;

/**
 * @author: cm
 * @date: Created in 2021/11/30 10:04
 * @description:定义循环队列
 */
public class MyCircularQueueTest {
    //存储数组
    private int[] queue;
    private int headIndex;
    private int count;
    private int capacity;

    public MyCircularQueueTest(int k) {
        this.queue = new int[k];
        this.capacity = k;
        this.headIndex = 0;
        this.count = 0;
    }

    public boolean enQueue(int value) {
        if (this.capacity == this.count) {
            return false;
        }
        this.queue[(this.headIndex + this.count) % this.capacity] = value;
        this.count += 1;
        return true;
    }

    public boolean deQueue() {
        if (this.count == 0) {
            return false;
        }
        this.headIndex = (this.headIndex + 1) % this.capacity;
        this.count -= 1;
        return true;
    }

    public int Front() {
        if (this.count == 0) {
            return -1;
        }
        return this.queue[this.headIndex];
    }

    public int Rear() {
        if (this.count == 0) {
            return -1;
        }
        return this.queue[(this.headIndex + this.count - 1) % this.capacity];
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.capacity;
    }
}
