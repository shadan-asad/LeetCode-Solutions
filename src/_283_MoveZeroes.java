public class _283_MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int count = 0;
            for(int i = nums.length-1; i >= 0; i--) {
                if(nums[i] == 0) {
                    for(int j = i; j < nums.length-1-count; j++) {
                        nums[j] = nums[j+1];
                    }
                    count++;
                }
            }
            for(int i = nums.length-count; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
