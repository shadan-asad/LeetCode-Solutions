public class _287_FindtheDuplicateNumber {
    class Solution {
        public int findDuplicate(int[] nums) {
            int i = 0;
            while(i < nums.length) {
                int right = nums[i]-1;
                if(nums[i] != nums[right]) {
                    swap(nums, i, right);
                }else {
                    i++;
                }
            }
            return nums[nums.length-1];
        }
        public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
