import java.util.Arrays;
import java.util.HashMap;

public class _1636_SortArraybyIncreasingFrequency {
    class Solution {
        public int[] frequencySort(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    map.replace(nums[i], map.get(nums[i])+1);

                }else {
                    map.put(nums[i], 1);

                }
            }

            int[] values = new int[map.size()];
            int i = 0;
            for(Integer x : map.values()) {
                values[i] = x;
                i++;
            }

            Arrays.sort(values);
            int a = 0;
            for(int j = 0; j < values.length; j++) {
                int key = findKey(map, values[j]);

                for(int k = 0; k < values[j]; k++) {
                    nums[a] = key;
                    a++;
                }
            }
            return nums;
        }
        public int findKey(HashMap<Integer, Integer> map, int value) {
            int max = -101;
            for(Integer x : map.keySet()) {
                if(map.get(x) == value) {
                    if(x > max) {
                        max = x;
                    }
                }
            }
            map.remove(max, value);
            return max;
        }
    }
}
