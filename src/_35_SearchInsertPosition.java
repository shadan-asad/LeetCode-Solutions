public class _35_SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            if(target < nums[0])
                return 0;

            if(target > nums[nums.length-1])
                return nums.length;

            int start = 0, end = nums.length-1, index = 0;

            while(start <= end) {
                int mid = start+(end-start)/2;

                if(nums[mid] == target)
                    return mid;

                if(target < nums[mid]) {
                    end = mid-1;
                    index = mid;
                } else {
                    start = mid+1;
                    index = mid+1;
                }
            }

            return index;
        }
    }
}
