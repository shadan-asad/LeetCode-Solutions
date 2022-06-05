import java.util.ArrayList;
import java.util.Stack;

public class _1382_BalanceaBinarySearchTree {
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
            ArrayList<Integer> list = new ArrayList<Integer>();
            Stack<TreeNode> st = new Stack<TreeNode>();
            while(root != null || !st.isEmpty()) {
                while(root != null) {
                    st.push(root);
                    root = root.left;
                }
                root = st.pop();
                list.add(root.val);
                root = root.right;
            }

            TreeNode node = balance(list, 0, list.size()-1);
            return node;
        }

        private TreeNode balance(ArrayList<Integer> list, int i, int j) {
            if(i > j) {
                return null;
            }
            int mid = i+(j-i)/2;
            TreeNode node = new TreeNode(list.get(mid));

            node.left = balance(list, i, mid-1);
            node.right = balance(list, mid+1, j);


            return node;
        }
    }
}
