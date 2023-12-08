package meituan.listNodes;


import meituan.listNodes.ListNode;

public class reverseList {
    public ListNode ReverseList(ListNode node) {
        ListNode per = null, cur = node;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = per;
            per = cur;
            cur = tmp;
        }
        return per;
    }
}
