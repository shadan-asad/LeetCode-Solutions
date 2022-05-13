public class _268_MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            sort(nums, 0, nums.length-1);

            for(int i = 0; i < nums.length; i++) {
                if(i != nums[i])
                    return i;
            }


            return nums.length;
        }

        public void sort(int[] arr, int l, int r) {

            if(l < r) {
                int m = l+(r-l)/2;

                sort(arr, l, m);
                sort(arr, m+1, r);

                merge(arr, l, m, r);
            }
        }

        public void merge(int[] arr, int l, int m, int r) {
            int[] L = new int[m-l+1];
            int[] R = new int[r-m];

            for(int i = 0; i < L.length; i++)
                L[i] = arr[l+i];

            for(int j = 0; j < R.length; j++)
                R[j] = arr[m+1+j];

            int i=0, j=0, k=l;

            while(i<L.length && j<R.length) {
                if(L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                    k++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                    k++;
                }
            }

            while(i < L.length) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while(j < R.length) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

    }
}
