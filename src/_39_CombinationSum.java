import java.util.*;

public class _39_CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> sub = new ArrayList<Integer>();
            helper(candidates, target, ans, sub, 0, 0);

            return ans;
        }

        private void helper(int[] nums, int target, List<List<Integer>> ans, List<Integer> sub, int i, int sum) {
            if(i == nums.length || sum > target)
                return;
            if(sum == target) {
                ans.add(new ArrayList<Integer>(sub));
                return;
            }

            sub.add(nums[i]);
            sum += nums[i];
            helper(nums, target, ans, sub, i, sum);

            sum -= sub.get(sub.size()-1);
            sub.remove(sub.size()-1);
            helper(nums, target, ans, sub, i+1, sum);
        }
    }
}
