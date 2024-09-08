import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {
    @Test
    void reverseList() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        ReverseLinkedList.ListNode second = new ReverseLinkedList.ListNode(2);
        ReverseLinkedList.ListNode third = new ReverseLinkedList.ListNode(3);
        ReverseLinkedList.ListNode forth = new ReverseLinkedList.ListNode(4);
        ReverseLinkedList.ListNode fifth = new ReverseLinkedList.ListNode(5);
        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        ReverseLinkedList.ListNode reversed = new ReverseLinkedList().stack(head);

        assertEquals(reversed, fifth);
        assertEquals(reversed.next, forth);
        assertEquals(reversed.next.next, third);
        assertEquals(reversed.next.next.next, second);
        assertEquals(reversed.next.next.next.next, head);

        assertNull(new ReverseLinkedList().stack(null));

    }

    @Test
    void iterate() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        ReverseLinkedList.ListNode second = new ReverseLinkedList.ListNode(2);
        ReverseLinkedList.ListNode third = new ReverseLinkedList.ListNode(3);
        ReverseLinkedList.ListNode forth = new ReverseLinkedList.ListNode(4);
        ReverseLinkedList.ListNode fifth = new ReverseLinkedList.ListNode(5);
        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        ReverseLinkedList.ListNode reversed = new ReverseLinkedList().iterate(head);

        assertEquals(reversed, fifth);
        assertEquals(reversed.next, forth);
        assertEquals(reversed.next.next, third);
        assertEquals(reversed.next.next.next, second);
        assertEquals(reversed.next.next.next.next, head);

        assertNull(new ReverseLinkedList().iterate(null));

    }
}
