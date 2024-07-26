Problem Link : [https://leetcode.com/problems/longest-palindromic-substring/description/]
class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        int max_len = 0;
        int st = 0;
        int end = 0;

        //odd
        for(int i =0; i<n; i++){
            int l=i,r=i;
            while(l>=0 && r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }
                int len = r-l-1;
                if(len>max_len){
                    max_len = len;
                    st = l+1;
                    end = r-1;
                }
            }
        }


        //even
         for(int i =0; i<n; i++){
            int l=i,r=i+1;
            while(l>=0 && r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }
                int len = r-l-1;
                if(len>max_len){
                    max_len = len;
                    st = l+1;
                    end = r-1;
                }
            }
        }
    return s.substring(st,end+1);
    }
}

