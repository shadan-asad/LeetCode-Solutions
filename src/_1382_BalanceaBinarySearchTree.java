import java.util.Stack;

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
    public TreeNode balanceBST(TreeNode root) {
        int[] arr = new int[10000];
        int i = 0;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root != null || !st.isEmpty()) {
            while(root != null) {
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            arr[i] = root.val;
            i++;
            root = root.right;
        }

        TreeNode node = balance(arr, 0, i-1);
        return node;
    }

    private TreeNode balance(int[] list, int i, int j) {
        if(i > j) {
            return null;
        }
        int mid = i+(j-i)/2;
        TreeNode node = new TreeNode(list[mid]);

        node.left = balance(list, i, mid-1);
        node.right = balance(list, mid+1, j);


        return node;
    }
}