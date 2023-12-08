package meituan.listNodes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class palindromeLinkedList {
    /**
     * 将值复制到数组中后用双指针法
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int len = list.size();
        int left = 0, right = len - 1;
        while (left <= right) {
            if (list.get(left++) != list.get(right--))
                return false;
        }
        return true;
    }

    /**
     * 递归,没学会
     */
    private ListNode frontPointer;

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }


}
