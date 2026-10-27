/*
Platform: LeetCode
Problem Number: 14
Problem: Longest Common Prefix
Difficulty: Easy
Topic: String, Array, StringBuilder

Approach: First, find the common prefix between the first two strings using a helper method. Then, iterate through the remaining strings and update the common prefix by comparing it with each string. The helper method compares characters at the same positions and builds the common prefix until a mismatch occurs or the shorter string ends. Finally, return the longest common prefix shared by all strings.

Time Complexity: O(n * m)
Space Complexity: O(m)

Here, n is the number of strings and m is the length of the longest string.
Status: Solved
*/

class Solution {
    public static String common(String s1,String s2){
        StringBuilder sb=new StringBuilder();
        int len1=s1.length();
        int len2=s2.length();
        int len=Math.min(len1,len2);
        int i=0;
        while(i<len){
            if(s1.charAt(i)!=s2.charAt(i)){
                return sb.toString();
            }
            sb.append(s1.charAt(i));
            i++;
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String comm=common(strs[0],strs[1]);
        for(int i=2;i<strs.length;i++){
            comm=common(comm,strs[i]);
        }

        return comm;
    }
}