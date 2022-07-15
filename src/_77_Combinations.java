import java.util.*;
public class _77_Combinations {
    class Solution {

        public List<List<Integer>> combine(int n, int k) {
            List<Integer> nums = new ArrayList<>();
            for(int i = 1; i <= n; i++)
                nums.add(i);
            return helper(nums, 0, k);
        }

        private List<List<Integer>> helper(List<Integer> nums, int i, int k) {
            if(nums.size() - i == k) {
                List<List<Integer>> base = new ArrayList<List<Integer>>();
                base.add(nums.subList(i, nums.size()));
                return base;
            }

            List<List<Integer>> subAns = helper(nums, i+1, k);
            HashSet<List<Integer>> set = new HashSet<List<Integer>>();
            int n = subAns.size();
            for(int j = 0; j < n; j++) {
                for(int x = 0; x < subAns.get(j).size(); x++) {
                    List<Integer> temp = new ArrayList<Integer>(subAns.get(j));
                    temp.set(x, nums.get(i));
                    Collections.sort(temp);
                    set.add(temp);
                }
            }
            subAns.addAll(set);
            return subAns;
        }
    }
}
