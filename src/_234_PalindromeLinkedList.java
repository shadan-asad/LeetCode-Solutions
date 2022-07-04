public class _234_PalindromeLinkedList {
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
        public boolean isPalindrome(ListNode head) {
            ListNode slow=head, fast=head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode one = null, two = slow, three;
            while(two != null) {
                three = two.next;
                two.next = one;
                one = two;
                two = three;
            }

            while(one != null) {
                if(one.val != head.val)
                    return false;

                head = head.next;
                one = one.next;
            }

            return true;
        }
    }
}
