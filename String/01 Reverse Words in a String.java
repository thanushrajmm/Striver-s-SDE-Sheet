Problem Link : [https://leetcode.com/problems/reverse-words-in-a-string/]
class Solution {
    public String reverseWords(String s) {
        String[] sentence = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = sentence.length - 1; i > 0; i--) {
            result.append(sentence[i]).append(" ");
        }
        result.append(sentence[0]);
        return result.toString();
    }
}
------------------------------------------------------------------------------------------------
class Solution {
    public String reverseWords(String s) {
        String res = new String();
        int i=0; 
        int n = s.length();

        while(i < n){
            while(i < n && s.charAt(i) == ' ') i++;
            if(i >= n) break;
            
            int j = i+1;
            while(j < n && s.charAt(j) != ' ') j++;

            String sub = s.substring(i, j);
            if(res.length() == 0) {
                res = sub;
            }
            else{
                res = sub + " " + res;
            } 
            i = j+1;
        }
        return res;
    }
}
