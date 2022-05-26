import java.util.Arrays;

public class _654_MaximumBinaryTree {
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

        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if(nums.length == 0)
                return null;

            int m = nums[0], pos = 0;
            for(int i=0; i < nums.length; i++)
                if(nums[i] > m) {
                    m = nums[i];
                    pos = i;
                }

            TreeNode x = new TreeNode(m);
            if(pos > 0)
                x.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, pos));

            x.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, pos+1, nums.length));
            return x;
        }

    }
}
