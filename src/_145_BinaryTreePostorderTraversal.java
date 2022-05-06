import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _145_BinaryTreePostorderTraversal {
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

        public List<Integer> postorderTraversal(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Stack<TreeNode> st = new Stack<TreeNode>();
            while(root != null) {
                list.add(0, root.val);
                if(root.left != null)
                    st.push(root.left);

                root = root.right;

                if(root == null && !st.isEmpty())
                    root = st.pop();
            }
            return list;
        }
    }
}
