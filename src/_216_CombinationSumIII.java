import java.util.ArrayList;
import java.util.List;

public class _216_CombinationSumIII {
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            int[] arr = new int[9];
            for(int i = 1; i <= 9; i++)
                arr[i-1] = i;
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> sub = new ArrayList<Integer>();
            helper(arr, ans, sub, k, n, 0, 0);
            return ans;
        }

        private void helper(int[] arr, List<List<Integer>> ans, List<Integer> sub, int k, int n, int i, int sum) {
            if(sub.size() == k && sum == n) {
                ans.add(new ArrayList<Integer>(sub));
                return;
            }
            if(i == arr.length || sub.size() == k || sum > n)
                return;

            sub.add(arr[i]);
            sum += arr[i];
            helper(arr, ans, sub, k, n, i+1, sum);
            sub.remove(sub.size()-1);
            sum -= arr[i];

            helper(arr, ans, sub, k, n, i+1, sum);
        }
    }
}
