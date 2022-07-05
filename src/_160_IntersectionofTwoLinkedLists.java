public class _160_IntersectionofTwoLinkedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int l1 = 0, l2 = 0;
            ListNode temp = headA;
            while(temp != null) {
                l1++;
                temp = temp.next;
            }
            temp = headB;
            while(temp != null) {
                l2++;
                temp = temp.next;
            }

            if(l1 > l2) {
                l1 = l1-l2;
                while(l1 > 0) {
                    headA = headA.next;
                    l1--;
                }
            } else {
                l2 = l2-l1;
                while(l2 > 0) {
                    headB = headB.next;
                    l2--;
                }
            }

            while(headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }

            return headA;
        }
    }
}
