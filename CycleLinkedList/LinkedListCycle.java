package com.company;


public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow !=fast){
            if (fast ==null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow == fast;
    }

    ///HashSet Solution
    /* if (head == null) {
            return false;
        }

        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) {
                return true;
            }

            set.add(head);
            head = head.next;
        }
        return false;*/
}
