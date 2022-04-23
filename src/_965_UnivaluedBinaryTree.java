import java.util.ArrayDeque;

public class _965_UnivaluedBinaryTree {
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
        public boolean isUnivalTree(TreeNode root) {
            int val = root.val;
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();

            while(root != null) {
                if(root.val != val)
                    return false;

                if(root.right != null) {
                    st.push(root.right);
                }
                root = root.left;

                if(root == null && !st.isEmpty()) {
                    root = st.pop();
                }
            }

            return true;
        }
    }
}
