package linkedlist;

/*
 * @author: cm
 * @date: Created in 2021/9/15 19:11
 * @description:203、移除链表元素
 */
public class Solution203 {
    public static ListNode removeElements(ListNode head, int val) {
        int count = 0;
        ListNode firstNode = null;
        ListNode nowNode = null;
        while (head != null) {
            if (head.val != val) {
                if (count == 0) {
                    firstNode = new ListNode();
                    firstNode.val = head.val;
                    nowNode = firstNode;
                    count++;
                } else {
                    ListNode listNode2 = new ListNode();
                    listNode2.val = head.val;
                    nowNode.next = listNode2;
                    nowNode = listNode2;
                }
            }
            head = head.next;
        }
        return firstNode;
    }

    public static ListNode removeElementsGF1(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElementsGF1(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static ListNode removeElementsGF2(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode6 = new ListNode(6, null);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(6, listNode3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode listNode = new ListNode(1, listNode1);
        ListNode listNode7 = Solution203.removeElements(listNode, 6);
    }
}



