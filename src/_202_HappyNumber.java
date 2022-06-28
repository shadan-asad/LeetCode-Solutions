import java.util.HashSet;

public class _202_HappyNumber {
    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<Integer>();
            int num = 0;
            while (n != 1) {
                num = 0;
                while (n > 0) {
                    num += (n%10)*(n%10);
                    n = n/10;
                }

                if (set.contains(num))
                    return false;

                set.add(num);
                n = num;
            }

            return true;
        }
    }
}
