Problem Link : [https://leetcode.com/problems/longest-palindromic-substring/description/]
class Solution {
    private String s;
    private int max_len;
    private int st;
    private int end;

    public void getPalindromeLen(int l, int r){
        int n = s.length();
         while( l >= 0 && r<n) {
            if(s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }else
                break;
            }
            int len = r-l-1;
            if(len>max_len){
                max_len = len;
                st = l+1;
                end = r-1;
            }
        }
    
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        this.s = s;
        max_len = 1;
        int n = s.length();
        st = 0; 
        end = 0;

        //odd length;
        for(int i = 0; i<n ; i++){
            int l = i, r = i;
        getPalindromeLen(l,r);
        }
        //even length;
        for(int i = 0; i<n-1 ; i++){
            int l = i, r = i+1;
        getPalindromeLen(l,r);
        }
      return s.substring(st, end + 1);
    }
}
