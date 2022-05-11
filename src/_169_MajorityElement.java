import java.util.Arrays;

public class _169_MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);

            return nums[nums.length/2];
        }
    }
}
