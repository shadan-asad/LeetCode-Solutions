import java.util.Scanner;

public class Codechef_TIMELY {
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0) {
                int x = sc.nextInt();
                if(x-30 >= 0) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }

}
