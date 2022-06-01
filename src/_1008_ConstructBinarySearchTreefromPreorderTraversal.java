import java.util.ArrayDeque;

public class _1008_ConstructBinarySearchTreefromPreorderTraversal {
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
        public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root = new TreeNode(preorder[0]);
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();
            TreeNode cur = root;
            st.push(root);

            for(int i = 1; i < preorder.length; i++) {
                if(preorder[i] < cur.val) {
                    cur.left = new TreeNode(preorder[i]);
                    cur = cur.left;
                    st.push(cur);
                }else {
                    while(!st.isEmpty() && preorder[i] > st.peek().val) {
                        cur = st.pop();
                    }
                    cur.right = new TreeNode(preorder[i]);
                    cur = cur.right;
                    st.push(cur);
                }
            }
            return root;
        }
    }
}
