public class _1539_KthMissingPositiveNumber {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int i = 1, j = 0, count = 0;

            while(j < arr.length && count < k) {
                if(i == arr[j]) {
                    j++;
                    i++;
                    continue;
                }
                count++;
                i++;
            }

            while(count < k) {
                count++;
                i++;
            }

            return i-1;
        }
    }
}
