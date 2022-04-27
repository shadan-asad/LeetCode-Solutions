public class _744_FindSmallestLetterGreaterThanTarget {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            if(target < letters[0] || target >= letters[letters.length-1])
                return letters[0];

            int low = 0, loop = 1, high = letters.length-1;
            while(low < high) {
                System.out.println("loop: "+loop);
                int mid = low + (high-low)/2;

                if(letters[mid] == target) {
                    if(letters[mid+1] > target) {
                        System.out.println(mid+1);
                        return letters[mid+1];
                    }
                    low = mid+1;
                }

                else if(letters[mid] < target) {
                    if(letters[mid+1] > target) {
                        System.out.println(mid+1);
                        return letters[mid+1];

                    }

                    low = mid+1;

                }else {
                    if(letters[mid-1] <= target) {
                        System.out.println(mid);
                        return letters[mid];

                    }

                    high = mid-1;
                }
                loop++;
            }
            System.out.println("end");
            return letters[0];
        }
    }
}
