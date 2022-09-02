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
            return help(nums, 0, nums.length-1);
        }
        public TreeNode help(int[] arr, int i, int j) {
            if(i <= j) {
                int mid = i+(j-i)/2;
                TreeNode node = new TreeNode(arr[mid]);
                node.left = help(arr, i, mid-1);
                node.right = help(arr, mid+1, j);
                return node;
            }
            return null;
        }
    }
}
