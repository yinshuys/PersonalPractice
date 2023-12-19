package meituan.listNodes;

/**
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。
 * 请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 */
public class reverseLinkListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        // 找到left前面的一个阶段
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // 找到right的后面一个节点
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        ListNode leftNode = pre.next;  // left
        ListNode cur = rightNode.next; // right的下一个

        // 切断链接
        rightNode.next = null; // 尾部切断，right后面
        pre.next = null; //开头切断，left前面

        // 翻转链表
        reverse(leftNode);

        //回归到原来的链表
        pre.next = rightNode;
        leftNode.next = cur;

        return dummyNode.next;
    }

    public void reverse(ListNode node) {
        ListNode cur = node, pre = null;

        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
    }



}
