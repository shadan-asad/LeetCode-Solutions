public class _53_MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int currSum = 0, max = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++) {
                currSum += nums[i];
                if(currSum > max){
                    max = currSum;
                }
                if(currSum < 0) {
                    currSum = 0;
                }
            }
            return max;
        }
    }
}
