package TwoPointers;

public class Validpalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            //String str = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();

            //System.out.println(str);


            int l = 0;
            int r = s.length() - 1;

            while (l < r) {

                if (!isAlpNum(s.charAt(l))) {
                    l++;
                    continue;
                }

                if (!isAlpNum(s.charAt(r))) {
                    r--;
                    continue;
                }



                //System.out.println(s.charAt(l));
                //System.out.println(isUpperAndConvertLower(s.charAt(l)));
                //System.out.println(s.charAt(r));
                //System.out.println(isUpperAndConvertLower(s.charAt(r)));

                if (isUpperAndConvertLower(s.charAt(l)) != isUpperAndConvertLower(s.charAt(r)))  {
                    return false;
                }

                l++;
                r--;

            }


            return true;
        }

        private char isUpperAndConvertLower (char c) {
            //System.out.println(c);
            if (c >= 'A' && c <= 'Z') {
                //System.out.println((char)(c + 'a' - 'A'));
                return (char)(c + 'a' - 'A');
            }
            else {
                //System.out.println(c);
                return c;
            }

        }

        private boolean isAlpNum(char c) {
            if (c >= 'A' && c <= 'Z') return true;
            if (c >= 'a' && c <= 'z') return true;
            if (c >= '0' && c <= '9') return true;
            return false;
        }
    }
}
