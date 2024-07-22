Problem link -> [https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/]
class Solution {
    public int strStr(String haystack, String needle) {
        
        //return haystack.indexOf(needle);
        
        // If needle is empty, return 0
    if (needle.isEmpty()) {
        return 0;
    }
    
    int haystackLength = haystack.length();
    int needleLength = needle.length();
    
    // Loop through the haystack, but stop early enough to prevent out of bounds
    for (int i = 0; i <= haystackLength - needleLength; i++) {
        // Check the substring of haystack for equality with needle
        if (haystack.substring(i, i + needleLength).equals(needle)) {
            return i;
        }
    }
    
    // If no match was found, return -1
    return -1;
    }
}
