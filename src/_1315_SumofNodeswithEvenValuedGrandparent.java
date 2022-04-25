import java.util.ArrayDeque;

public class _1315_SumofNodeswithEvenValuedGrandparent {
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
        public int sumEvenGrandparent(TreeNode root) {
            int sum = 0;
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();
            st.push(root);

            while(!st.isEmpty()) {
                TreeNode t = st.pop();
                if(t.val%2 == 0) {
                    if(t.left != null) {
                        if(t.left.left != null) {
                            sum += t.left.left.val;
                        }
                        if(t.left.right != null) {
                            sum += t.left.right.val;
                        }

                    }
                    if(t.right != null) {
                        if(t.right.left != null) {
                            sum += t.right.left.val;
                        }
                        if(t.right.right != null) {
                            sum += t.right.right.val;
                        }

                    }
                }
                if(t.left != null)
                    st.addLast(t.left);
                if(t.right != null)
                    st.addLast(t.right);
            }
            return sum;

        }
    }
}
