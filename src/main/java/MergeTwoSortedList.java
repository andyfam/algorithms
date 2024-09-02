public class MergeTwoSortedList {

    public static class ListNode {
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
    }

    public ListNode newList(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode current = newList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        current.next = list1 == null ? list2 : list1;

        return newList.next;
    }


    public ListNode recursion(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = recursion(list1.next, list2);
            return list1;
        } else {
            list2.next = recursion(list1, list2.next);
            return list2;
        }
    }
}
