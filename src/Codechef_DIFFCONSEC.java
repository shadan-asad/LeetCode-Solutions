import java.util.Scanner;

public class Codechef_DIFFCONSEC {
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int count = 0;
                String s = sc.next();
                for(int i = 0; i < n-1; i++) {
                    if(s.charAt(i) == s.charAt(i+1)) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }

}
