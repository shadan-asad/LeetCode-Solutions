public class _23_MergekSortedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length == 0)
                return null;
            else if(lists.length == 1)
                return lists[0];

            ListNode list1 = lists[0];
            for(int i = 1; i < lists.length; i++) {
                list1 = merge(list1, lists[i]);
            }
            return list1;
        }

        private ListNode merge(ListNode list1, ListNode list2) {
            if(list1 == null)
                return list2;
            else if(list2 == null)
                return list1;

            ListNode head, temp;
            if(list1.val < list2.val) {
                head = list1;
                temp = list1;
                list1 = list1.next;
            }else {
                head = list2;
                temp = list2;
                list2 = list2.next;
            }

            while(list1 != null && list2 != null) {
                if(list1.val < list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                    temp = temp.next;
                }else {
                    temp.next = list2;
                    list2 = list2.next;
                    temp = temp.next;
                }
            }
            if(list1 != null) {
                temp.next = list1;
            }else {
                temp.next = list2;
            }
            return head;
        }
    }
}
