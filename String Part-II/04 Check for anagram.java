problem link -> [https://leetcode.com/problems/valid-anagram/]
class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if(m!=n){
            return false;
        }
        else{
            int count[] =new int[26];
        
        for(int i =0; i<m; i++){
            count[s.charAt(i)-'a']++;
        }
        for(int j = 0; j<n; j++){
            count[t.charAt(j)-'a']--;
        }
        for(int k = 0; k<count.length; k++){
            if(count[k]!=0){
                return false;
            }
        }
    return true;
    }
}
}
