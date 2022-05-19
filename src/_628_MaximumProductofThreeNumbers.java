import java.util.Arrays;

public class _628_MaximumProductofThreeNumbers {
    class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int prod = Integer.MIN_VALUE, l = nums.length, temp = 0;

            temp = nums[0]*nums[1]*nums[2];
            if(temp > prod) {
                prod = temp;
            }

            temp = nums[l-1]*nums[l-2]*nums[l-3];
            if(temp > prod) {
                prod = temp;
            }
            temp = nums[0]*nums[1]*nums[l-1];
            if(temp > prod) {
                prod = temp;
            }

            for(int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]+" ");
            }

            return prod;
        }
    }
}
