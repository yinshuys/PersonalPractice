package meituan.listNodes;

import meituan.listNodes.ListNode;

import java.util.LinkedList;
import java.util.List;

public class trainingPlanII {
    public ListNode trainingPlan(ListNode head, int cnt) {
        List<ListNode> list = new LinkedList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int len = list.size();
        ListNode res = list.get(len - cnt);
        return res;
    }

    public ListNode trainingPlan1(ListNode head, int cnt) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && cnt != 0) {
            fast = fast.next;
            cnt--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
