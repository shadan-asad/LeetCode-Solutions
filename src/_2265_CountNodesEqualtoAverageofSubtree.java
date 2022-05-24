public class _2265_CountNodesEqualtoAverageofSubtree {
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
        int count = 0, t=0, c=0;
        public int averageOfSubtree(TreeNode root) {
            if(root.left != null)
                averageOfSubtree(root.left);
            t=0; c=0;

            if(avrg(root) == root.val)
                count++;
            if(root.right != null)
                averageOfSubtree(root.right);

            return count;
        }

        private int avrg(TreeNode root) {
            if(root.left != null)
                avrg(root.left);
            t += root.val;
            c++;
            if(root.right != null)
                avrg(root.right);
            return t/c;
        }

    }
}
