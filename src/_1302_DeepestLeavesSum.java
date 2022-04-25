import java.util.ArrayDeque;

public class _1302_DeepestLeavesSum {
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
        public int deepestLeavesSum(TreeNode root) {
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();
            int sum = 0;
            st.push(root);

            while(!st.isEmpty()) {
                sum = 0;
                int size = st.size();

                while(size-- > 0) {
                    TreeNode temp = st.pop();
                    sum += temp.val;

                    if(temp.left != null)
                        st.addLast(temp.left);

                    if(temp.right != null)
                        st.addLast(temp.right);
                }
            }
            return sum;
        }
    }
}
