import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _102_BinaryTreeLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            if(root == null)
                return ans;

            ArrayDeque<TreeNode> q = new ArrayDeque<>();
            q.add(root);
            while(!q.isEmpty()) {
                int n = q.size();
                ArrayList<Integer> cur = new ArrayList<Integer>();

                for(int i = 0; i < n; i++) {
                    if(q.peek().left != null)
                        q.add(q.peek().left);
                    if(q.peek().right != null) {
                        q.add(q.peek().right);
                    }
                    cur.add(q.pop().val);
                }
                ans.add(cur);
            }
            return ans;
        }
    }
}
