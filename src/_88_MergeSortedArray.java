public class _88_MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int temp, i = 0, j = 0, h = 0;
            int[] num = new int[m];

            for(int a = 0; a < m; a++) {
                num[a] = nums1[a];
            }

            while(i < m && j < n) {
                if(nums2[j] < num[i]) {
                    nums1[h] = nums2[j];
                    j++;
                }else {
                    nums1[h] = num[i];
                    i++;
                }
                h++;
            }
            while(i < num.length) {
                nums1[h] = num[i];
                i++; h++;
            }
            while(j < nums2.length) {
                nums1[h] = nums2[j];
                j++; h++;
            }
        }
    }

}
