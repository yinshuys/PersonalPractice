package meituan.listNodes;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 * <p>
 * L0 → L1 → … → Ln - 1 → Ln
 * 请将其重新排列后变为：
 * <p>
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class reorderListNode {
    /**
     * 线性表
     *
     * @param head
     */
    public void reorderList(ListNode head) {
        if (head == null) return;
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int len = list.size();
        int i = 0, j = len - 1;
        while (i < j) {
            list.get(i).next = list.get(j);
            i++;
            if (i == j) {
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }

    /**
     * 运行失败了
     * @param head
     */
    public void reorderList1(ListNode head) {
        if (head == null) return;
        ListNode mid = middleNode(head);
        ListNode node1 = head;
        ListNode node2 = mid.next;
        mid.next = null;
        node2 = reverseList(node2);
        mergeList(node1, node2);
    }

    public ListNode middleNode(ListNode node) {
        ListNode slow = node, fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode node) {
        ListNode per = null, cur = node;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = per;
            per = cur;
            cur = tmp;
        }
        return per;
    }

    public void mergeList(ListNode node1, ListNode node2) {
        ListNode l1 = node1, l2 = node2;
        while (l1 != null && l2 != null) {
            l1 = node1.next;
            l2 = node2.next;

            l1.next = l2;
            node1 = l1;

            l2.next = l1;
            node2 = l2;
        }
    }
}
