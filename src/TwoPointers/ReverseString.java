package TwoPointers;

public class ReverseString {
    class Solution {
        public String reverseString(String s) {
            /**
             char[] word = s.toCharArray();
             int i = 0;
             int j = s.length() - 1;
             while (i < j) {
             char temp = word[i];
             word[i] = word[j];
             word[j] = temp;
             i++;
             j--;
             }
             return new String(word);
             **/
            byte[] bytes = s.getBytes();
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                byte temp = bytes[i];
                bytes[i] = bytes[j];
                bytes[j] = temp;
                i++;
                j--;
            }
            return new String(bytes);
        }
    }
}
