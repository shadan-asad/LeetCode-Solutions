import java.util.ArrayList;
import java.util.List;

public class _442_FindAllDuplicatesinanArray {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> list = new ArrayList<>();
            int i = 0;
            while(i < nums.length) {
                int index = nums[i]-1;
                if(nums[i] != nums[index]) {
                    swap(nums, i, index);
                } else {
                    i++;
                }
            }
            for(i = 0; i < nums.length; i++) {
                if(nums[i] != i+1)
                    list.add(nums[i]);
            }

            return list;
        }
        public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
