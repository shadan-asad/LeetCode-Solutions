import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144_BinaryTreePreorderTraversal {
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
        public List<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Stack<TreeNode> st = new Stack<TreeNode>();

            while(root != null) {
                list.add(root.val);
                if(root.right != null)
                    st.push(root.right);

                root = root.left;

                if(root == null && !st.isEmpty())
                    root = st.pop();
            }
            return list;
        }
    }
}
