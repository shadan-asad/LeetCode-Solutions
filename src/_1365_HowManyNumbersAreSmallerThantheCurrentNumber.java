import java.util.Arrays;

public class _1365_HowManyNumbersAreSmallerThantheCurrentNumber {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int temp[] = nums.clone();

            Arrays.sort(nums);
            //quickSort(nums, 0, nums.length-1);

            for(int i = 0; i < temp.length; i++) {
                for(int j = 0; j < nums.length; j++) {
                    if(nums[j] == temp[i]) {
                        temp[i] = j;
                        break;
                    }
                }
            }
            return temp;
        }

    }
}
