import java.util.*;

public class _78_Subsets {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            return helper(nums, 0);
        }

        private List<List<Integer>> helper(int[] nums, int i) {

            if(i == nums.length)  {
                List<List<Integer>> list = new ArrayList<>();
                list.add(new ArrayList<Integer>());
                return list;
            }

            List<List<Integer>> subAns = helper(nums, i+1);
            int size = subAns.size();
            for(int j = 0; j < size; j++) {
                List<Integer> t = new ArrayList<>(subAns.get(j));
                t.add(nums[i]);
                subAns.add(t);
            }

            return subAns;
        }
    }


}
