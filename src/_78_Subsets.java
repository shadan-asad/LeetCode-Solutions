import java.util.*;

public class _78_Subsets {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> sub = new ArrayList<Integer>();
            helper(nums, ans, sub, 0);
            ans.add(sub);
            return ans;
        }

        private void helper(int[] nums, List<List<Integer>> ans, List<Integer> sub, int i) {
            if(i == nums.length)
                return;

            sub.add(nums[i]);
            helper(nums, ans, sub, i+1);

            ans.add(new ArrayList<Integer>(sub));

            sub.remove(sub.size()-1);
            helper(nums, ans, sub, i+1);

        }
    }
}
