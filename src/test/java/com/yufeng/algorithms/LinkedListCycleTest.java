package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {
    @Test
    void hashMap() {
//        LinkedListCycle.ListNode head = new LinkedListCycle.ListNode(3);
//        LinkedListCycle.ListNode second = new LinkedListCycle.ListNode(2);
//        LinkedListCycle.ListNode third = new LinkedListCycle.ListNode(0);
//        LinkedListCycle.ListNode forth = new LinkedListCycle.ListNode(-4);
//        head.next = second;
//        second.next = third;
//        third.next = forth;
//        forth.next = second;

//        assertTrue(new LinkedListCycle().hasCycle(head));

//        LinkedListCycle.ListNode head = new LinkedListCycle.ListNode(1);
//        LinkedListCycle.ListNode second = new LinkedListCycle.ListNode(2);
//        head.next = second;
//        second.next = head;

//        assertTrue(new LinkedListCycle().hasCycle(head));

        LinkedListCycle.ListNode head = new LinkedListCycle.ListNode(1);

        assertFalse(new LinkedListCycle().hashMap(head));
    }

    @Test
    void twoPointer() {
        LinkedListCycle.ListNode head = new LinkedListCycle.ListNode(3);
        LinkedListCycle.ListNode second = new LinkedListCycle.ListNode(2);
        LinkedListCycle.ListNode third = new LinkedListCycle.ListNode(0);
        LinkedListCycle.ListNode forth = new LinkedListCycle.ListNode(-4);
        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = second;

        assertTrue(new LinkedListCycle().twoPointer(head));
    }
}
