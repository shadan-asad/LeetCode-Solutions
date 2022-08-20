public class _844_BackspaceStringCompare {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            int i = 0, c, l = 0, j = -1;
            while(i < s.length()) {
                c = 0;
                if(s.charAt(i) == '#') {
                    while(i < s.length() && s.charAt(i) == '#') {
                        c++; i++;
                    }
                    if(c <= l) {
                        j = i-2*c;
                    }else {
                        j = i-(l+c);
                    }
                    if(j >= 0)
                        s = s.substring(0, j) + s.substring(i, s.length());
                    i = 0; l = 0;
                } else {
                    i++; l++;
                }
            }

            i = 0; l = 0; j = -1;
            while(i < t.length()) {
                c = 0;
                if(t.charAt(i) == '#') {
                    while(i < t.length() && t.charAt(i) == '#') {
                        c++; i++;
                    }
                    if(c <= l) {
                        j = i-2*c;
                    }else {
                        j = i-(l+c);
                    }
                    if(j >= 0)
                        t = t.substring(0, j) + t.substring(i, t.length());
                    i = 0; l = 0;
                } else {
                    i++; l++;
                }
            }
            if(s.equals(t))
                return true;
            return false;
        }
    }
}
