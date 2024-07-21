Problem link -> [https://leetcode.com/problems/longest-common-prefix/]
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int currIndex = 0;

        if(strs.length == 1){
            return strs[0];
        }

        StringBuilder result = new StringBuilder();

        while(true){

            for(int i = 0; i<strs.length - 1; i++){
                if(currIndex >= strs[i].length() || currIndex >= strs[i+1].length() ||  strs[i].charAt(currIndex) != strs[i+1].charAt(currIndex) ){
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(currIndex));
            currIndex++;
        }
    }
}
