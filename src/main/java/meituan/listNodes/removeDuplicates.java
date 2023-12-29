package meituan.listNodes;

/**
 * 82. 删除排序链表中的重复元素 II
 * 给定一个已排序的链表的头 head， 删除原始链表中所有重复数字的节点，
 * 只留下不同的数字。返回已排序的链表 。
 */
public class removeDuplicates {
    // 空链表的头
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while (cur.next != null && cur.next.next != null) {
            // 因为cur初始是0；
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return pre.next;
    }
}
