import java.util.*;
public class _46_Permutations {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            return helper(nums, 0);
        }
        private List<List<Integer>> helper(int[] nums, int i) {
            if(nums.length-1 == i) {
                List<List<Integer>> baseAns = new ArrayList<List<Integer>>();
                List<Integer> x = new ArrayList<Integer>();
                x.add(nums[i]);
                baseAns.add(x);
                return baseAns;
            }

            List<List<Integer>> subAns = helper(nums, i+1);
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            for(List<Integer> x : subAns) {
                for(int j = 0; j <= x.size(); j++) {
                    List<Integer> temp = new ArrayList<Integer>(x);
                    temp.add(j, nums[i]);
                    ans.add(temp);
                }
            }
            return ans;
        }
    }
}
