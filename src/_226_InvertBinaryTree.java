import java.util.ArrayDeque;

public class _226_InvertBinaryTree {
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
        public TreeNode invertTree(TreeNode root) {
            TreeNode troot = root;
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();

            while(root != null) {
                if(root.left != null || root.right != null) {
                    TreeNode temp = root.left;
                    root.left = root.right;
                    root.right = temp;
                }
                if(root.right != null)
                    st.push(root.right);

                root = root.left;

                if(root == null && !st.isEmpty()) {
                    root = st.pop();
                }
            }

            return troot;
        }
    }
}
