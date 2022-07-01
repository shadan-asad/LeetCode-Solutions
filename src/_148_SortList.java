public class _148_SortList {
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
        public ListNode sortList(ListNode head) {
            if(head == null || head.next == null)
                return head;

            ListNode slow = head, fast = head;
            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode head2 = slow.next;
            slow.next = null;

            ListNode left = sortList(head);
            ListNode right = sortList(head2);

            return mergeList(left, right);

        }

        public ListNode mergeList(ListNode list1, ListNode list2) {
            if (list1 == null)
                return null;

            if (list2 == null)
                return null;

            ListNode head, temp;

            if(list2.val <= list1.val) {
                head = list2;
                list2 = list2.next;
            } else {
                head = list1;
                list1 = list1.next;
            }

            temp = head;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    temp.next = list1;
                    list1 = list1.next;

                } else {
                    temp.next = list2;
                    list2 = list2.next;

                }
                temp = temp.next;
            }
            if (list1 != null) {
                temp.next = list1;
            }
            if (list2 != null) {
                temp.next = list2;
            }
            return head;
        }
    }
}
