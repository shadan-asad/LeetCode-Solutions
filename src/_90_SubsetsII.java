import java.util.*;
public class _90_SubsetsII {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            HashSet<List<Integer>> set = new HashSet<List<Integer>>();
            helper(nums, 0, set);
            return new ArrayList<List<Integer>>(set);
        }

        private void helper(int[] nums, int i, HashSet<List<Integer>> set) {
            if(i == nums.length) {
                List<Integer> temp = new ArrayList<Integer>();
                set.add(temp);
                return;
            }

            helper(nums, i+1, set);
            HashSet<List<Integer>> temp = new HashSet<List<Integer>>(set);

            for(List<Integer> x : temp) {
                List<Integer> cur = new ArrayList<Integer>(x);
                cur.add(nums[i]);
                Collections.sort(cur);
                set.add(cur);
            }
        }
    }
}
