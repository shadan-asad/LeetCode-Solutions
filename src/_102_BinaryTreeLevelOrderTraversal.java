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
                ArrayList<TreeNode> list = new ArrayList<>();
                ArrayList<Integer> cur = new ArrayList<Integer>();
                while(!q.isEmpty()) {
                    cur.add(q.peek().val);
                    list.add(q.pop());
                }
                ans.add(cur);
                for(TreeNode t : list) {
                    if(t.left != null)
                        q.add(t.left);
                    if(t.right != null) {
                        q.add(t.right);
                    }
                }
            }
            return ans;
        }
    }
}
