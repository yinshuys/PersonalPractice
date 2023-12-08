package meituan.listNodes;

import java.util.LinkedList;
import java.util.List;

/**
 * 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class middleOfLinkedlist {
    /**
     * 利用list将ListNode的各个节点都存储下来，利用长度取中间值
     *
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        if (head == null) return head;
        List<ListNode> list = new LinkedList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int len = list.size();
        return list.get(len / 2);
    }

    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public ListNode middleNode1(ListNode head) {
        if (head == null) return head;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
