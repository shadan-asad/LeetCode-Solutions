public class _1608_SpecialArrayWithXElementsGreaterThanorEqualX {
    class Solution {
        public int specialArray(int[] nums) {
            int count = 0;
            int start = 1, end = nums.length;

            while(start <= end) {
                int mid = start + (end-start)/2;
                count = 0;
                for(int j = 0; j < nums.length; j++) {
                    if(nums[j] >= mid)
                        count++;

                }
                if(count == mid)
                    return count;
                if(count > mid)
                    start = mid+1;
                else
                    end = mid-1;
            }

            return -1;
        }
    }
}
