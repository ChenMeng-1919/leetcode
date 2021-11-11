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

    public static ListNode reverseListGF2(ListNode head) {
        //总的思路就是保存下一个节点，反转，移动两个指针
        ListNode resultnode = null;
        ListNode nextNode;
        while (head != null) {
            //因为要改变当前节点指向，所以提前保存下一个节点
            nextNode = head.next;
            //当前节点指向前一个节点
            head.next = resultnode;
            //改变指向后，当前节点变成下一个操作中的前一个节点，即移动结果链表指针
            resultnode = head;
            //改变指向，讲保存的下一个节点赋给head，即移动要处理的链表指针
            head = nextNode;
        }
        return resultnode;
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
