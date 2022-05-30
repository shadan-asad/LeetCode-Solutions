public class _977_SquaresofaSortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] arr = new int[nums.length];

            for(int x = 0; x < nums.length; x++)
                arr[x] = nums[x];

            int i, j=0, k=0;
            while(j<nums.length && nums[j] < 0)
                j++;

            i = j-1;
            while(i >= 0 && j < nums.length) {

                if((nums[i]*(-1)) <= nums[j]) {
                    arr[k] = nums[i]*nums[i];
                    i--;

                } else {
                    arr[k] = nums[j]*nums[j];
                    j++;
                }
                k++;

            }

            while(i >= 0) {
                arr[k] = nums[i]*nums[i];
                i--;
                k++;
            }
            while(j < nums.length) {
                arr[k] = nums[j]*nums[j];
                j++;
                k++;
            }
            return arr;
        }
    }
}
