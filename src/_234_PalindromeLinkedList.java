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
            ListNode slow = head, fast = head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            if(fast != null)
                slow = slow.next;

            ListNode head2 = rev(slow);

            while(head != null && head2 != null) {
                if(head.val != head2.val)
                    return false;
                head2 = head2.next;
                head = head.next;
            }
            return true;
        }
        private ListNode rev(ListNode h) {
            ListNode pre = null, cur = h, next;
            while(cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }

            return pre;
        }
    }
}
