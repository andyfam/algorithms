package com.yufeng.algorithms;

import java.util.Stack;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode stack(ListNode head) {
        if (head == null) {
            return head;
        }

        Stack<ListNode> stack = new Stack<>();
        stack.push(head);

        while (head.next != null) {
            stack.push(head.next);
            head = head.next;
        }

        head = stack.pop();
        ListNode current = head;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        //avoid cycle in the node
        current.next = null;

        return head;
    }

    public ListNode iterate(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        ListNode tmp;
        while(current != null){
            tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }

        return prev;
    }
}
