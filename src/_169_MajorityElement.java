import java.util.Arrays;

public class _169_MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int major = nums[0];
            int c = 1;
            for(int i = 1; i < nums.length; i++) {
                if(c == 0) {
                    major = nums[i];
                    c = 1;
                }else if(nums[i] == major) {
                    c++;
                }else {
                    c--;
                }
            }
            return major;
        }
    }
}
