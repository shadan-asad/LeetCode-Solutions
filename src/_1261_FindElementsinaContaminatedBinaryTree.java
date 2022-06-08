import java.util.ArrayList;

public class _1261_FindElementsinaContaminatedBinaryTree {
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
    class FindElements {
        ArrayList<Integer> list = new ArrayList<Integer>();
        public FindElements(TreeNode root) {
            root.val = 0;
            list.add(root.val);
            recover(root);

        }
        private void recover(TreeNode node) {
            if(node == null)
                return;

            if(node.left != null) {
                node.left.val = node.val*2+1;
                list.add(node.left.val);
            }
            if(node.right != null) {
                node.right.val = node.val*2+2;
                list.add(node.right.val);
            }

            recover(node.left);
            recover(node.right);
        }

        public boolean find(int target) {
            if(list.contains(target))
                return true;
            return false;
        }
    }

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
}
