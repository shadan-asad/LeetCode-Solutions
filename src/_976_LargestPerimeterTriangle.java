public class _976_LargestPerimeterTriangle {
    public class Solution {
        public static int largestPerimeter(int[] nums) {
            int max;
            for(int i = nums.length-1; i >=0; i--) {
                max = i;
                for(int j = i-1; j >= 0; j--) {
                    if(nums[j] > nums[max]) {
                        max = j;
                    }

                }
                swap(nums, i, max);
                if(i <= nums.length-3) {
                    if(!(nums[i] >= nums[i+1]+nums[i+2] ||
                            nums[i+1] >= nums[i]+nums[i+2] || nums[i+2] >= nums[i]+nums[i+1])) {
                        return nums[i]+nums[i+1]+nums[i+2];
                    }
                }
            }

            return 0;
        }
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
