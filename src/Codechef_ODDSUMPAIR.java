import java.util.Scanner;

public class Codechef_ODDSUMPAIR {

    /* Name of the class has to be "Main" only if the class is public. */
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                if((a+b)%2 == 1 || (b+c)%2 == 1 || (a+c)%2 == 1) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }

}
