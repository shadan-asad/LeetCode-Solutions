public class _543_DiameterofBinaryTree {
    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null) return 0;
            int d = helper(root.left)+helper(root.right);
            return Math.max(d, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
        }
        public int helper(TreeNode root) {
            if(root == null) {
                return 0;
            }
            return 1+Math.max(helper(root.left), helper(root.right));
        }
    }
}
