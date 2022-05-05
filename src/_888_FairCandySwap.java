public class _888_FairCandySwap {
    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

            int[] arr = new int[2];
            int sum1 = 0, sum2 = 0, target;

            for(int num : aliceSizes)
                sum1 += num;

            for(int num : bobSizes)
                sum2 += num;

            for(int i = 0; i < aliceSizes.length; i++) {
                for(int j = 0; j < bobSizes.length; j++) {
                    if(sum1-aliceSizes[i]+bobSizes[j] == sum2-bobSizes[j]+aliceSizes[i]) {
                        arr[0] = aliceSizes[i];
                        arr[1] = bobSizes[j];
                        return arr;
                    }
                }
            }

            return arr;
        }
    }
}
