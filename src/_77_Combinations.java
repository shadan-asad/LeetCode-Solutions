import java.util.*;
public class _77_Combinations {
    class Solution {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        public List<List<Integer>> combine(int n, int k) {
            int nums[] = new int[n];
            for(int i = 1; i <= n; i++)
                nums[i-1] = i;

            for(List<Integer> x : helper(nums, 0)) {
                if(x.size() == k)
                    list.add(x);
            }
            return list;
        }

        private List<List<Integer>> helper(int[] nums, int i) {
            if(i == nums.length) {
                List<List<Integer>> base = new ArrayList<>();
                base.add(new ArrayList<Integer>());
                return base;
            }

            List<List<Integer>> subAns = helper(nums, i+1);
            int n = subAns.size();
            for(int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList<Integer>(subAns.get(j));
                temp.add(nums[i]);
                subAns.add(temp);
            }
            return subAns;
        }
    }
}
