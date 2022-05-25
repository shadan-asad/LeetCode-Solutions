public class _645_SetMismatch {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int[] arr = new int[2];
            int i = 0;
            while(i < nums.length) {
                int index = nums[i]-1;
                if(nums[i] != nums[index])
                    swap(nums, i, index);
                else
                    i++;
            }
            for(i = 0; i < nums.length; i++) {
                if(nums[i] != i+1) {
                    arr[0] = nums[i];
                    arr[1] = i+1;
                    break;
                }
            }
            return arr;
        }
        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
