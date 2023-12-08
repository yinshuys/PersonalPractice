package meituan.listNodes;

/**
 * 给定两个以 有序链表 形式记录的训练计划 l1、l2，
 * 分别记录了两套核心肌群训练项目编号，请合并这两个训练计划，按训练项目编号 升序 记录于链表并返回。
 * 注意：新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class trainingPlanIV {
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(0);
        ListNode cur = fake;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return fake.next;
    }
}
