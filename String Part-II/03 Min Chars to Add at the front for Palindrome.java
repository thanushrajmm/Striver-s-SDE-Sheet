Problem link -> [https://www.geeksforgeeks.org/problems/minimum-characters-to-be-added-at-front-to-make-string-palindrome/1]
class Solution {
    public static int minChar(String str) {
       //Write your code here
           int i = 0;
        int j = str.length() - 1;
        int trim = j;
        int res = 0;
        
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                res++;
                i = 0;
                j = --trim;
            }
        }
        
        return res;
    }
}
