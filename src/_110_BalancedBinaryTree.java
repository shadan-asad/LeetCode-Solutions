public class _110_BalancedBinaryTree {
    class Solution {
        boolean ans = true;
        public boolean isBalanced(TreeNode root) {
            if(root == null)
                return true;
            help(root);
            return ans;
        }
        public int help(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int l = help(root.left);
            int r = help(root.right);
            if(Math.abs(l-r) > 1) {
                ans = false;
                return 0;
            }
            if(l > r) {
                return l+1;
            }
            return r+1;
        }
    }
}
