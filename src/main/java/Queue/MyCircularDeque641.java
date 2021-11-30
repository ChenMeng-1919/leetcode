package Queue;

/**
 * @author: cm
 * @since: Created in 2021/11/30 11:21
 * @description:
 */
public class MyCircularDeque641 {
    private int[] queue;
    private int headIndex;
    private int count;
    private int capacity;

    public MyCircularDeque641(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
    }

    public boolean insertFront(int value) {
        if (this.count == this.capacity) {
            return false;
        }
        this.headIndex = (this.capacity + this.headIndex - 1) % this.capacity;
        this.queue[this.headIndex] = value;
        this.count += 1;
        return true;
    }

    public boolean insertLast(int value) {
        if (this.count == this.capacity) {
            return false;
        }
        this.queue[(this.headIndex + this.count) % this.capacity] = value;
        this.count += 1;
        return true;
    }

    public boolean deleteFront() {
        if (this.count == 0) {
            return false;
        }
        this.headIndex = (this.headIndex + 1) % this.capacity;
        this.count -= 1;
        return true;
    }

    public boolean deleteLast() {
        if (this.count == 0) {
            return false;
        }
        this.count -= 1;
        return true;
    }

    public int getFront() {
        if (this.count == 0) {
            return -1;
        }
        return this.queue[this.headIndex];
    }

    public int getRear() {
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
