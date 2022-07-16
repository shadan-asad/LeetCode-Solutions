public class _724_FindPivotIndex {
    class Solution {
        public int pivotIndex(int[] nums) {
            int sum = 0;
            for(int x : nums)
                sum += x;

            if(sum == nums[0])
                return 0;

            for(int i = 0; i < nums.length-1; i++) {
                if(sum - (2*nums[i]) == nums[i+1])
                    return i+1;
                sum = sum-2*nums[i];
            }
            return -1;
        }
    }
}
