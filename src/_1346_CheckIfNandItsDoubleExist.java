import java.util.HashSet;

public class _1346_CheckIfNandItsDoubleExist {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            HashSet<Integer> set = new HashSet<Integer>();
            int count = 0;

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 0) {
                    count++;
                    if(count == 2)
                        return true;
                }else {
                    set.add(arr[i]);
                    if(set.contains(arr[i]*2)) {
                        return true;

                    }else if(arr[i]%2 == 0 && set.contains(arr[i]/2)) {
                        return true;
                    }
                }
            }


            return false;
        }
    }
}
