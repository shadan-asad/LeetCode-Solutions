import java.util.ArrayList;
import java.util.List;

public class _448_FindAllNumbersDisappearedinanArray {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] arr) {
            List<Integer> list = new ArrayList<Integer>();
            int i = 0;
            while(i < arr.length) {
                int right = arr[i]-1;
                if(arr[i] != arr[right]) {
                    swap(arr, i, right);
                } else {
                    i++;
                }
            }
            for(i = 0; i < arr.length; i++) {
                if(arr[i] != i+1)
                    list.add(i+1);
            }

            return list;
        }
        public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
