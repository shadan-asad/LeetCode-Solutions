import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _1305_AllElementsinTwoBinarySearchTrees {
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
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();

            ArrayList<Integer> l1 = new ArrayList<Integer>();
            ArrayList<Integer> l2 = new ArrayList<Integer>();

            while(root1 != null || !st.isEmpty()) {
                while(root1 != null) {
                    st.push(root1);
                    root1 = root1.left;
                }

                root1 = st.pop();
                l1.add(root1.val);
                root1 = root1.right;
            }
            st.clear();

            while(root2 != null || !st.isEmpty()) {
                while(root2 != null) {
                    st.push(root2);
                    root2 = root2.left;
                }
                root2 = st.pop();
                l2.add(root2.val);
                root2 = root2.right;
            }

            ArrayList<Integer> list = new ArrayList<Integer>();
            int i = 0, j = 0;
            while(i < l1.size() && j < l2.size()) {
                if(l1.get(i) < l2.get(j)) {
                    list.add(l1.get(i));
                    i++;
                }else {
                    list.add(l2.get(j));
                    j++;
                }
            }
            while(i < l1.size()) {
                list.add(l1.get(i));
                i++;
            }
            while(j < l2.size()) {
                list.add(l2.get(j));
                j++;
            }

            return list;
        }
    }
}
