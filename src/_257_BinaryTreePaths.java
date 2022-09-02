import java.util.ArrayList;
import java.util.List;

public class _257_BinaryTreePaths {

    class Solution {
        List<String> list = new ArrayList<String>();
        public List<String> binaryTreePaths(TreeNode root) {
            help(root, "");
            return list;
        }
        public void help(TreeNode root, String cur) {
            if(root == null) {
                return;
            }
            if(root.left == null && root.right == null) {
                list.add(cur+root.val);
                return;
            }
            String t = cur+root.val+"->";
            help(root.left, t);
            help(root.right, t);
        }
    }
}
