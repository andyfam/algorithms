import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListTest {

    @Test
    void hashMap() {
        MergeTwoSortedList.ListNode list1 = buildList1();

        MergeTwoSortedList.ListNode list2 = buildList2();

        MergeTwoSortedList.ListNode listMerge = buildListMerge();

        MergeTwoSortedList.ListNode list = new MergeTwoSortedList().recursion(list1, list2);

        while(list != null && listMerge != null){
            assertEquals(list.val, listMerge.val);
            list = list.next;
            listMerge = listMerge.next;
        }
    }

    @Test
    void newList() {
        MergeTwoSortedList.ListNode list1 = buildList1();

        MergeTwoSortedList.ListNode list2 = buildList2();

        MergeTwoSortedList.ListNode listMerge = buildListMerge();

        MergeTwoSortedList.ListNode list = new MergeTwoSortedList().newList(list1, list2);

        while(list != null && listMerge != null){
            assertEquals(list.val, listMerge.val);
            list = list.next;
            listMerge = listMerge.next;
        }
    }

    private MergeTwoSortedList.ListNode buildList1(){
        MergeTwoSortedList.ListNode list1 = new MergeTwoSortedList.ListNode(1);
        MergeTwoSortedList.ListNode list1_2 = new MergeTwoSortedList.ListNode(2);
        MergeTwoSortedList.ListNode list1_3 = new MergeTwoSortedList.ListNode(4);
        list1.next = list1_2;
        list1_2.next = list1_3;

        return list1;
    }

    private MergeTwoSortedList.ListNode buildList2(){
        MergeTwoSortedList.ListNode list2 = new MergeTwoSortedList.ListNode(1);
        MergeTwoSortedList.ListNode list2_2 = new MergeTwoSortedList.ListNode(3);
        MergeTwoSortedList.ListNode list2_3 = new MergeTwoSortedList.ListNode(4);
        list2.next = list2_2;
        list2_2.next = list2_3;

        return list2;
    }

    private MergeTwoSortedList.ListNode buildListMerge(){
        MergeTwoSortedList.ListNode listMerge = new MergeTwoSortedList.ListNode(1);
        MergeTwoSortedList.ListNode listMerge_2 = new MergeTwoSortedList.ListNode(1);
        MergeTwoSortedList.ListNode listMerge_3 = new MergeTwoSortedList.ListNode(2);
        MergeTwoSortedList.ListNode listMerge_4 = new MergeTwoSortedList.ListNode(3);
        MergeTwoSortedList.ListNode listMerge_5 = new MergeTwoSortedList.ListNode(4);
        MergeTwoSortedList.ListNode listMerge_6 = new MergeTwoSortedList.ListNode(4);
        listMerge.next = listMerge_2;
        listMerge_2.next = listMerge_3;
        listMerge_3.next = listMerge_4;
        listMerge_4.next = listMerge_5;
        listMerge_5.next = listMerge_6;

        return listMerge;
    }
}
