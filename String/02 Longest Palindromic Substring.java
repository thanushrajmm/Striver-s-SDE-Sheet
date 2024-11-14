Problem Link : [https://leetcode.com/problems/longest-palindromic-substring/description/]

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length()<1) return "";
        
        int start = 0;
        int end = 0;

        for(int i = 0; i< s.length(); i++){
            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s,i,i+1);
            int maxLen = Math.max(len1,len2);

            if(maxLen > end - start){
                start = i - ((maxLen - 1) / 2 );
                end = i + (maxLen/2); 
            }
        }
        return s.substring(start,end+1);
    }

    public int expandFromMiddle(String s, int left, int right){
        if(s == null || left>right) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
------------------------------------------------------------------------------------------------
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

