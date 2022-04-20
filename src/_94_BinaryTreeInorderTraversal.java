import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _94_BinaryTreeInorderTraversal {
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<Integer>();

            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();

            while(root != null) {
                if(root.left != null) {
                    st.push(root);
                    TreeNode temp = root.left;
                    root.left = null;
                    root = temp;
                } else {
                    list.add(root.val);
                    root = root.right;
                }

                if(root == null && !st.isEmpty()) {
                    root = st.pop();
                }
            }
            return list;
        }
    }
}
