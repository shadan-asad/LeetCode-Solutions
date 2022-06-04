import java.util.Arrays;
import java.util.HashMap;

public class _1331_RankTransformofanArray {

    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            int[] ans = new int[arr.length];
            ans = arr.clone();

            Arrays.sort(arr);

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < arr.length; i++) {
                if(!map.containsKey(arr[i])) {
                    map.put(arr[i], map.size()+1);
                }
            }

            for(int i = 0; i < ans.length; i++) {
                arr[i] = map.get(ans[i]);
            }
            return arr;
        }
    }
}
