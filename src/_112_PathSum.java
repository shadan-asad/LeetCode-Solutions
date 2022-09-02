public class _112_PathSum {
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null) {
                return false;
            }
            return help(root, 0, targetSum);
        }
        public boolean help(TreeNode root, int sum, int target) {
            if(root == null) {
                return false;
            }
            if(root.left == null && root.right == null && sum+root.val == target) {
                return true;
            }
            boolean left = help(root.left, sum+root.val, target);
            boolean right = help(root.right, sum+root.val, target);

            return (left || right);
        }
    }
}
