public class _1304_FindNUniqueIntegersSumuptoZero {
    class Solution {
        public int[] sumZero(int n) {
            int[] arr = new int[n];
            int x = 1;

            for(int i = 0; i < n-1; i += 2) {
                arr[i] = x;
                arr[i+1] = -1*x;
                x++;
            }
            if(n%2 == 1)
                arr[n-1] = 0;

            return arr;
        }
    }
}
