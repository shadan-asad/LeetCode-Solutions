import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40_CombinationSumII {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> sub = new ArrayList<Integer>();
            Arrays.sort(candidates);
            helper(candidates, target, ans, sub, 0, 0);
            return ans;
        }
        private void helper(int[] nums,int target, List<List<Integer>> ans, List<Integer> sub, int i, int sum){
            if(sum == target) {
                ans.add(new ArrayList<Integer>(sub));
                return;
            }
            if(i == nums.length || sum > target)
                return;

            sub.add(nums[i]);
            sum += nums[i];
            helper(nums, target, ans, sub, i+1, sum);

            while(i+1 < nums.length && nums[i] == nums[i+1]) i++;

            sum -= sub.get(sub.size()-1);
            sub.remove(sub.size()-1);
            helper(nums, target, ans, sub, i+1, sum);

        }
    }
}
