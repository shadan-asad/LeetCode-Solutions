public class _2325_DecodetheMessage {
    class Solution {
        public String decodeMessage(String key, String message) {
            Character[] arr = new Character[26];
            char c = 'a'+0;
            for(int i = 0; i < key.length(); i++) {
                if(key.charAt(i) == ' ')
                    continue;
                if(arr[key.charAt(i)-'a'] == null)
                    arr[key.charAt(i)-'a'] = c++;
            }

            key = "";
            for(int i = 0; i < message.length(); i++) {
                if(message.charAt(i) == ' ') {
                    key += ' ';
                }else {
                    key += arr[((int)(message.charAt(i)-'a'))];
                }
            }
            return key;
        }
    }
}
