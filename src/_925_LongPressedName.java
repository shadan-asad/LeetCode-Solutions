public class _925_LongPressedName {
    class Solution {
        public boolean isLongPressedName(String name, String typed) {

            int i = name.length()-1, j = typed.length()-1;
            if(name.charAt(i) == typed.charAt(j)) {
                i = 0;
                j = 0;
            }else {
                return false;
            }

            while(i < name.length() && j < typed.length()) {
                if(name.charAt(i) == typed.charAt(j)) {
                    i++;
                    j++;
                }else if(j > 0 && typed.charAt(j) == typed.charAt(j-1)){
                    j++;
                }else
                    return false;
            }

            while(j < typed.length()) {
                if(typed.charAt(j) == typed.charAt(j-1))
                    j++;
                else
                    return false;
            }
            if(i == name.length())
                return true;

            return false;
        }
    }
}
