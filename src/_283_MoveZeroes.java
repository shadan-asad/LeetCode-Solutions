import java.util.ArrayList;

public class _283_MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int x : nums)
                if(x != 0)
                    list.add(x);
            int i = 0;
            for(Integer x : list)
                nums[i++] = x;
            for(; i < nums.length; i++)
                nums[i] = 0;
        }
    }
}
