public class _698_PartitiontoKEqualSumSubsets {
    class Solution {
        public boolean canPartitionKSubsets(int[] arr, int k) {
            int picked[] = new int[arr.length];
            int req = 0;
            for(int x : arr) {
                req += x;
            }
            req = req/k;
            return help(arr, 0, picked, 0, req, 0, k);
        }
        private boolean help(int[] arr, int i, int[] picked, int sum, int req, int count, int k) {
            if(count == k) return true;
            if(sum == req) {
                return help(arr, 0, picked, 0, req, count+1, k);
            }
            if(i >= arr.length || sum > req)
                return false;
            if(picked[i] == 1) {
                return help(arr, i+1, picked, sum, req, count, k);
            }


            picked[i] = 1;
            sum += arr[i];
            boolean one = help(arr, i+1, picked, sum, req, count, k);

            sum -= arr[i];
            picked[i] = 0;
            boolean two = help(arr, i+1, picked, sum, req, count, k);

            if(one == false && two == false)
                return false;

            return true;

        }
    }
}
