public class _142_LinkedListCycleII {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null)
                return head;

            ListNode slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    break;
            }

            while (fast.next != null && fast.next.next != null) {
                do {
                    if (head == slow.next) {
                        return head;
                    }
                    slow = slow.next;
                } while (slow != fast);

                head = head.next;
            }

            return null;
        }
    }
}
