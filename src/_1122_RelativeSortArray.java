import java.util.Arrays;

public class _1122_RelativeSortArray {
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            Arrays.sort(arr1);

            int ans[] = new int[arr1.length];
            int k = 0;

            for(int i = 0; i < arr2.length; i++) {
                for(int j = 0; j < arr1.length; j++) {
                    if(arr1[j] == arr2[i]) {
                        ans[k] = arr1[j];
                        k++;
                        arr1[j] = -1;
                    }
                }
            }

            for(int i = 0; i < arr1.length; i++) {
                if(arr1[i] != -1) {
                    ans[k] = arr1[i];
                    k++;
                }
            }

            return ans;
        }
    }
}
