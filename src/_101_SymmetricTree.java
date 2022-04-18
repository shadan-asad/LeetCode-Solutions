public class _101_SymmetricTree {
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
        public boolean isSymmetric(TreeNode root) {
            return isSymm(root.left, root.right);
        }

        public boolean isSymm(TreeNode r1, TreeNode r2) {
            if(r1 == null && r2 == null)
                return true;
            else if(r1 == null || r2 == null)
                return false;

            boolean t = false;
            if(r1.val == r2.val) {
                t = isSymm(r1.left, r2.right);
                if(t) {
                    t = isSymm(r1.right, r2.left);
                }
            } else {
                return false;
            }
            return t;
        }
    }
}
