package linkedlist;

/*
 * @author: cm
 * @date: Created in 2021/9/15 19:06
 * @description:单向链表
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
