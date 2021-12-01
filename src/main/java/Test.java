import Queue.MyCircularDeque641;
import Queue.MyCircularQueue;
import Queue.MyStack225;
import stack.Solution20;

/*
 * @author: cm
 * @date: Created in 2021/11/15 10:14
 * @description:
 */
public class Test {
    public static void main(String[] ars) {
        /*MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
        myCircularQueue.enQueue(5);
        myCircularQueue.deQueue();
        myCircularQueue.Front();
        myCircularQueue.Rear();*/
        /*MyCircularDeque641 myCircularDeque641 = new MyCircularDeque641(3);
        System.out.println(myCircularDeque641.insertLast(1));
        System.out.println(myCircularDeque641.insertLast(2));
        System.out.println(myCircularDeque641.insertFront(3));
        System.out.println(myCircularDeque641.insertFront(4));
        int rear = myCircularDeque641.getRear();
        System.out.println(rear);
        boolean full = myCircularDeque641.isFull();
        System.out.println(full);
        boolean b = myCircularDeque641.deleteLast();
        System.out.println(b);
        boolean b1 = myCircularDeque641.insertFront(4);
        System.out.println(b1);
        int rear2 = myCircularDeque641.getRear();
        System.out.println(rear2);*/

        String s = "()[]{}";
        Solution20 solution20 = new Solution20();
        System.out.println(solution20.isValid2(s));

    }
}
