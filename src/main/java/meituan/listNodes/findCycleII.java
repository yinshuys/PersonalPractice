package meituan.listNodes;

/**
 * 给定一个链表的头节点head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 不允许修改链表。
 */
public class findCycleII {
    /**
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        // 这里fast取值为head，否则slow追不上
        ListNode slow = head, fast = head;
        while (true) {
            if (fast.next == null || fast.next.next == null) {
                return new ListNode(-1);
            }
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }
        fast = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
