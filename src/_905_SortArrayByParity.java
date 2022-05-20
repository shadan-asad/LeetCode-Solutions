public class _905_SortArrayByParity {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int i = 0, j = 1;
            while(j < nums.length && i <= j) {
                if(i==j)
                    j++;
                else if(nums[i] % 2 == 0) {
                    i++;
                }else if(nums[j] % 2 == 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++; j++;
                }else
                    j++;
            }
            return nums;
        }
    }
}
