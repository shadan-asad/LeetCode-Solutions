import java.util.ArrayDeque;

public class _938_RangeSumofBST {

     //Definition for a binary tree node.
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
        public int rangeSumBST(TreeNode root, int low, int high) {
            int sum = 0;
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();

            while(root != null) {
                if(root.val >= low && root.val <= high) {
                    sum += root.val;
                    if(root.right != null) st.push(root.right);
                    root = root.left;
                }else {
                    if(root.val < low) {
                        root = root.right;
                    }else if(root.val > high) {
                        root = root.left;
                    }
                }
                if(root == null && !st.isEmpty()) {
                    root = st.pop();
                }
            }
            return sum;
        }
    }
}
