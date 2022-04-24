public class _278_FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            if(n == 1)
                return 1;

            int start = 1, end = n;

            while(start < end) {
                int mid = start + (end-start)/2;

                boolean ans = isBadVersion(mid);

                if(ans) {
                    if(!isBadVersion(mid-1))
                        return mid;
                    else
                        end = mid-1;

                }else {
                    if(isBadVersion(mid+1))
                        return mid+1;
                    else
                        start = mid+1;
                }
            }
            return end;
        }
    }
}
