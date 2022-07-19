import java.util.*;
public class _90_SubsetsII {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> sub = new ArrayList<Integer>();
            Arrays.sort(nums);
            helper(nums, ans, sub, 0);
            ans.add(new ArrayList<Integer>());
            return ans;
        }

        private void helper(int[] nums, List<List<Integer>> ans, List<Integer> sub, int i) {
            if(i == nums.length)
                return;

            sub.add(nums[i]);
            helper(nums, ans, sub, i+1);

            ans.add(new ArrayList<Integer>(sub));

            while(i+1 < nums.length && nums[i] == nums[i+1]) i++;

            sub.remove(sub.size()-1);
            helper(nums, ans, sub, i+1);
        }
    }
}
