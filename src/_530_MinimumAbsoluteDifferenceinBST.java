import java.util.ArrayList;

public class _530_MinimumAbsoluteDifferenceinBST {
    class Solution {
        ArrayList<Integer> list = new ArrayList<>();
        public int getMinimumDifference(TreeNode root) {
            traverse(root);
            int mad = Integer.MAX_VALUE;
            for(int i = 0; i < list.size(); i++) {
                for(int j = i+1; j < list.size(); j++) {
                    int diff = Math.abs(list.get(i)-list.get(j));
                    if(diff < mad) {
                        mad = diff;
                    }
                }
            }
            return mad;
        }
        public void traverse(TreeNode root) {
            if(root == null) return;
            list.add(root.val);
            traverse(root.left);
            traverse(root.right);
        }
    }
}
