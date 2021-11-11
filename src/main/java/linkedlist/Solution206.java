package linkedlist;

/*
 * @author: cm
 * @date: Created in 2021/11/11 14:24
 * @description:
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode nowNode = null;
        int count = 0;
        while (head != null) {
            if (count == 0) {
                nowNode = new ListNode();
                nowNode.val = head.val;
                head = head.next;
                count++;
            } else {
                ListNode listNode = new ListNode();
                listNode.val = head.val;
                listNode.next = nowNode;
                nowNode = listNode;
                head = head.next;
            }
        }
        return nowNode;
    }

    public static ListNode reverseListGF1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            //next指向下一个节点，用来存储下一个节点
            ListNode next = curr.next;
            //当前节点指向前一个节点
            curr.next = prev;
            //讲当前节点变成反转后的头节点
            prev = curr;
            //curr指向下一个节点
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode6 = new ListNode(6, null);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(6, listNode3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode listNode = new ListNode(1, listNode1);
        ListNode listNode7 = reverseListGF1(listNode);
    }
}
