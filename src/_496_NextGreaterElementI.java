public class _496_NextGreaterElementI {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int j, temp;
            for(int i = 0; i < nums1.length; i++) {
                j = nums2.length-1;
                temp = -1;
                while(nums1[i] != nums2[j]) {
                    if(nums2[j] > nums1[i]) {
                        temp = nums2[j];
                    }
                    j--;
                }
                nums1[i] = temp;
            }
            return nums1;
        }
    }
}
