package com.company;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public class ReverseLinkedList {
        public ListNode reverseList(ListNode head) {

            ListNode previous = null;
            ListNode next= null;
            while (head !=null){
                next =head.next;
                head.next =previous;
                previous=head;
                head = next;
            }
            return previous;
        }
        }
    }
