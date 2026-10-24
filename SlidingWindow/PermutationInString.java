/*
Problem: Permutation in String (Check Inclusion)
Topic: Sliding Window, Frequency Array
Approach: Compare character frequencies using two arrays of size 26 and slide a fixed-size window across s2
Time Complexity: O(n + m)
Space Complexity: O(1)
Status: Solved
*/


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n;i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b)){
            return true;
        }
        for(int i=n;i<m;i++){
            b[s2.charAt(i)-'a']++;
            b[s2.charAt(i-n)-'a']--;

            if(Arrays.equals(a,b)){
                return true;
            }
        }

        return false;

    }
}