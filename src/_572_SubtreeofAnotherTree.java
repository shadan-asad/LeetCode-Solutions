public class _572_SubtreeofAnotherTree {
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
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root == null || subRoot == null) {
                return false;
            }
            if(check(root, subRoot)) return true;

            boolean left = isSubtree(root.left, subRoot);
            boolean right = isSubtree(root.right, subRoot);

            return (left || right);
        }
        public boolean check(TreeNode root, TreeNode sub) {
            if(root == null && sub == null) {
                return true;
            }
            if(root == null || sub == null) {
                return false;
            }
            if(root.val != sub.val) {
                return false;
            }
            boolean left = check(root.left, sub.left);
            boolean right = check(root.right, sub.right);

            return (left && right);
        }
    }

}
