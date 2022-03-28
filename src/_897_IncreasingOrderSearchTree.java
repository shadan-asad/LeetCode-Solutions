import java.util.ArrayDeque;

public class _897_IncreasingOrderSearchTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public TreeNode increasingBST(TreeNode root) {
            if(root.left == null && root.right == null)
                return root;

            TreeNode node = new TreeNode();
            TreeNode next = new TreeNode();
            TreeNode head = new TreeNode();
            head = root;

            while(head.left != null) {
                head = head.left;
            }

            ArrayDeque<TreeNode> st = new ArrayDeque<>();

            while(root != null) {
                if(root.left == null) {
                    node.right = root;
                    if(root.right != null) {
                        st.push(root.right);
                    }
                    node = node.right;
                    root = null;
                    if(!st.isEmpty()) root = st.pop();
                } else {
                    next = root.left;
                    root.left = null;
                    st.push(root);
                    root = next;
                }

            }

            return head;
        }
    }
}
