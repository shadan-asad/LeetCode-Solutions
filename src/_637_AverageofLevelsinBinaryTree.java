import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _637_AverageofLevelsinBinaryTree {
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
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> list = new ArrayList<Double>();
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();
            st.push(root);

            while(!st.isEmpty()) {
                double sum = 0;
                int n = st.size();
                int size = n;
                while(n-- > 0) {
                    TreeNode temp = st.pop();
                    sum += temp.val;
                    if(temp.left != null)
                        st.addLast(temp.left);

                    if(temp.right != null)
                        st.addLast(temp.right);
                }
                sum = sum/size;
                list.add(sum);

            }
            return list;
        }
    }
}
