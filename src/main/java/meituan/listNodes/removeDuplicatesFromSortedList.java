package meituan.listNodes;

import meituan.listNodes.ListNode;

/**
 * 给定一个已排序的链表的头 head ，
 * 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class removeDuplicatesFromSortedList {
    /**
     * 指针操作
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == node.val) {
                node.next = node.next.next;
            } else
                node = node.next;
        }
        return head;
    }
}
