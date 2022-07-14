import java.util.*;
public class _47_PermutationsII {
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            return helper(nums, 0);
        }
        private List<List<Integer>> helper(int[] nums, int i) {
            if(i == nums.length-1) {
                List<List<Integer>> base = new ArrayList<List<Integer>>();
                List<Integer> l = new ArrayList<Integer>();
                l.add(nums[i]);
                base.add(l);
                return base;
            }

            List<List<Integer>> subAns = helper(nums, i+1);
            HashSet<List<Integer>> set = new HashSet<List<Integer>>();
            for(List<Integer> x : subAns) {
                for(int j = 0; j <= x.size(); j++) {
                    List<Integer> temp = new ArrayList<Integer>(x);
                    temp.add(j, nums[i]);
                    set.add(temp);
                }
            }
            subAns.clear();
            for(List<Integer> x : set) {
                subAns.add(x);
            }
            return subAns;
        }
    }
}
