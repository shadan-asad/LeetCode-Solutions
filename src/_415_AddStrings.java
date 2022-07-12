import java.util.ArrayList;

public class _415_AddStrings {
    class Solution {
        public String addStrings(String num1, String num2) {
            int i = 0, carry = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while(i < (num1.length()) && i < (num2.length())) {
                int x = (num1.charAt(num1.length()-1-i) - '0') +
                        (num2.charAt(num2.length()-1-i) - '0') + carry;

                carry = 0;
                //  System.out.println(x);

                if(x < 10)
                    list.add(0,x);
                else {
                    list.add(0,x%10);
                    carry = x/10;
                }
                i++;
            }
            while(i < num1.length()) {
                int x = (num1.charAt(num1.length()-1-i) - '0') + carry;
                carry = 0;
                if(x < 10)
                    list.add(0,x);
                else {
                    list.add(0,x%10);
                    carry = x/10;
                }
                i++;
            }
            while(i < num2.length()) {
                int x = (num2.charAt(num2.length()-1-i) - '0') + carry;
                carry = 0;
                if(x < 10)
                    list.add(0,x);
                else {
                    list.add(0,x%10);
                    carry = x/10;
                }
                i++;
            }
            if(carry != 0)
                list.add(0, carry);
            num1 = "";
            for(Integer x : list)
                num1 += x.toString();

            return num1;
        }
    }
}
