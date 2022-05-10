public class _108_ConvertSortedArraytoBinarySearchTree {
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
        public TreeNode sortedArrayToBST(int[] nums) {
            int mid = nums.length/2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = func(nums, 0, mid-1);
            root.right = func(nums, mid+1, nums.length-1);

            return root;
        }
        public TreeNode func(int[] arr, int start, int end) {
            if(start > end)
                return null;

            int mid = start+(end-start)/2;
            TreeNode t = new TreeNode(arr[mid]);
            t.left = func(arr, start, mid-1);
            t.right = func(arr, mid+1, end);
            return t;
        }
    }
}
