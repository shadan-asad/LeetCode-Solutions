import java.util.ArrayList;

public class _350_IntersectionofTwoArraysII {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {

            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            for(int num : nums1)
                list.add(num);

            for(int num : nums2) {
                if(list.contains(num)) {

                    list2.add(num);
                    list.remove((Integer)(num));
                    System.out.println("this");
                }
            }

            int arr[] = new int[list2.size()];
            int i = 0;

            for(Integer num : list2) {
                arr[i] = num;
                i++;
            }

            return arr;

        }
    }
}
