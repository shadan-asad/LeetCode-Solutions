public class _1108_DefangingAnIPAddress {
    class Solution {
        public String defangIPaddr(String address) {
            String newAdr = "";
            for(int i = 0; i < address.length(); i++) {
                if(address.charAt(i) == '.') {
                    newAdr += "[.]";
                }else
                    newAdr += address.charAt(i);
            }
            return newAdr;
        }
    }
}
