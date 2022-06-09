public class _1502_CanMakeArithmeticProgressionFromSequence {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {

            quickSort(arr, 0, arr.length-1);

            int diff = arr[1]-arr[0];

            for(int i = 1; i < arr.length-1; i++) {
                if((arr[i+1]-arr[i]) != diff)
                    return false;
            }
            return true;
        }

        public void quickSort(int[] arr, int l, int h) {

            if(l < h) {

                int s = l;
                int e = h;
                int m = l+(h-l)/2;
                int pivot = arr[m];

                while(s <= e) {

                    while(arr[s] < pivot)
                        s++;

                    while(arr[e] > pivot)
                        e--;

                    if(s <= e) {
                        int temp = arr[s];
                        arr[s] = arr[e];
                        arr[e] = temp;
                        s++;
                        e--;
                    }
                }
                quickSort(arr, l, e);
                quickSort(arr, s, h);
            }
        }
    }
}
