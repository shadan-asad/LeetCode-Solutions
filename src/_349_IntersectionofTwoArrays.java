import java.util.HashSet;

public class _349_IntersectionofTwoArrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> list = new HashSet<>();

            HashSet<Integer> set = new HashSet<>();

            for(int num : nums1)
                set.add(num);

            for(int num : nums2)
                if(set.contains(num))
                    list.add(num);

            int[] arr = new int[list.size()];

            int i = 0;
            for(Integer num : list) {
                arr[i] = num;
                i++;
            }

            return arr;
        }
    }
}
