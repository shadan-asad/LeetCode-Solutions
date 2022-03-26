import java.util.ArrayDeque;

public class _100_SameTree {

     // Definition for a binary tree node.
     public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null)
                return true;

            if(p == null || q == null)
                return false;

            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();
            ArrayDeque<TreeNode> st2 = new ArrayDeque<TreeNode>();

            while(p != null && q != null) {
                if(p.val != q.val) {
                    return false;
                }

                if(p.right != null) {
                    st.push(p.right);
                }
                if(q.right != null) {
                    st2.push(q.right);
                }

                if(st.size() != st2.size()) {
                    return false;
                }

                p = p.left;
                q = q.left;


                if(p == null && (!st.isEmpty())) {
                    p = st.pop();
                }
                if(q == null && (!st2.isEmpty())) {
                    q = st2.pop();
                }

            }
            if(st.isEmpty() && st2.isEmpty()) {
                return true;
            }

            return false;
        }
    }
}
