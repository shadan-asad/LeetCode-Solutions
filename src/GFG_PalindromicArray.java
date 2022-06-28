import java.util.Scanner;

public class GFG_PalindromicArray {
    // { Driver Code Starts

    class PalindromicArray{
        public void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ;i < n; i++)
                    a[i]=sc.nextInt();
                GfG g = new GfG();
                System.out.println(g.palinArray(a , n));
            }
        }
    }// } Driver Code Ends


    /*Complete the Function below*/
    class GfG
    {
        public static int palinArray(int[] arr, int n)
        {
            //add code here.
            for(int i = 0; i < n; i++) {
                String s = String.valueOf(arr[i]);
                int a = 0, b = s.length()-1;
                while(a < b) {
                    if(s.charAt(a) != s.charAt(b)) {
                        return 0;
                    }
                    a++; b--;
                }
            }
            return 1;
        }
    }
}
