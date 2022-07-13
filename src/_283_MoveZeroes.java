import java.util.ArrayList;

public class _283_MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int index = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    nums[index++] = nums[i];
                }
            }
            for(; index < nums.length; index++)
                nums[index] = 0;
        }
    }
}
