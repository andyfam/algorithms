import java.util.HashMap;

public class LinkedListCycle {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean twoPointer(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public boolean hashMap(ListNode head) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        ListNode current = head;

        while (current != null) {
            if (hashMap.containsKey(current)) {
                return true;
            } else {
                hashMap.put(current, current.val);
                current = current.next;
            }
        }

        return false;
    }


}
