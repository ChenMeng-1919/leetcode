package Queue;

import java.util.concurrent.locks.ReentrantLock;

/*
 * @author: cm
 * @date: Created in 2021/11/15 15:50
 * @description:
 */
public class MyCircularQueueLock {

    private Node head, tail;
    private int count;
    private int capacity;
    // Additional variable to secure the access of our queue
    private ReentrantLock queueLock = new ReentrantLock();

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueueLock(int k) {
        this.capacity = k;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        // ensure the exclusive access for the following block.
        queueLock.lock();
        try {
            if (this.count == this.capacity)
                return false;

            Node newNode = new Node(value);
            if (this.count == 0) {
                head = tail = newNode;
            } else {
                tail.nextNode = newNode;
                tail = newNode;
            }
            this.count += 1;

        } finally {
            queueLock.unlock();
        }
        return true;
    }

}
