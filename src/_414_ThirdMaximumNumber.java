import java.util.HashSet;

public class _414_ThirdMaximumNumber {

    class Solution {
        public int thirdMax(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int n : nums)
                set.add(n);

            int one = Integer.MIN_VALUE, two = Integer.MIN_VALUE, three = Integer.MIN_VALUE;

            for(Integer i : set) {
                if(i > one) {
                    three = two;
                    two = one;
                    one = i;

                }else if(i > two) {
                    three = two;
                    two = i;

                }else if(i > three) {
                    three = i;

                }
            }

            if(set.size() < 3)
                return one;

            return three;
        }
    }
}
