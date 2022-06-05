import java.util.ArrayList;

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
    ArrayList<TreeNode> list = new ArrayList<TreeNode>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);

        TreeNode node = balance(list, 0, list.size()-1);
        return node;
    }
    private void inorder(TreeNode root) {
        if(root == null)
            return;

        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    private TreeNode balance(ArrayList<TreeNode> list, int i, int j) {
        if(i > j) {
            return null;
        }
        int mid = i+(j-i)/2;
        TreeNode node = list.get(mid);

        node.left = balance(list, i, mid-1);
        node.right = balance(list, mid+1, j);

        return node;
    }
}