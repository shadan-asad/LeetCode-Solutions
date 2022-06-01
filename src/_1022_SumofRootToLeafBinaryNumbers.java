public class _1022_SumofRootToLeafBinaryNumbers {
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
        int sum = 0;
        public int sumRootToLeaf(TreeNode root) {
            int arr[] = new int[1000];
            int i = 0;
            r2l(root, arr, i);

            return sum;
        }

        private void r2l(TreeNode root, int[] arr, int i) {
            if(root == null)
                return;

            arr[i] = root.val;
            i++;
            if(root.left == null && root.right == null) {
                calculate(arr, i);
            }else {
                r2l(root.left, arr, i);
                r2l(root.right, arr, i);
            }
        }

        private void calculate(int[] arr, int i) {
            int j = i-1;
            int mul = 1;
            int d = 0;
            for(; j >= 0; j--) {
                if(arr[j] == 1) {
                    d += mul;
                }
                mul *= 2;
            }

            sum += d;
        }
    }
}
