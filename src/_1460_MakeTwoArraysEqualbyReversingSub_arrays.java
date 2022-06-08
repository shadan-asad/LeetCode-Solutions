public class _1460_MakeTwoArraysEqualbyReversingSub_arrays {
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            bubbleSort(target);
            bubbleSort(arr);

            for(int i = 0; i < target.length; i++) {
                if(target[i] != arr[i]) {
                    return false;
                }
            }
            return true;
        }

        public void bubbleSort(int[] arr) {
            for(int i = 0; i < arr.length-1; i++) {
                boolean swapped = false;
                for(int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                        swapped = true;
                    }
                }
                if(!swapped) {
                    break;
                }
            }
        }
    }
}
