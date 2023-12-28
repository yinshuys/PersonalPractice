package meituan.listNodes;

public class mergeTwoLists {
    public ListNode mergeLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val >= list2.val) {
            list2.next = mergeLists(list1, list2.next);
            return list2;
        } else {
            list1.next = mergeLists(list1.next, list2);
            return list1;
        }
    }

    public ListNode mergeLists1(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode cur = node;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return node.next;
    }
}
