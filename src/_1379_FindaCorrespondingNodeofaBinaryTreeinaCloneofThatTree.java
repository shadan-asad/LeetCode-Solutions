import java.util.ArrayDeque;

public class _1379_FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            ArrayDeque<TreeNode> st = new ArrayDeque<TreeNode>();
            st.push(cloned);

            while(!st.isEmpty()) {
                TreeNode t = st.pop();
                if(t.val == target.val)
                    return t;

                if(t.left != null)
                    st.addLast(t.left);

                if(t.right != null)
                    st.addLast(t.right);

            }
            return target;
        }
    }
}
