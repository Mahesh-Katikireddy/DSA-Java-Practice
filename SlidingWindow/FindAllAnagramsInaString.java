/*
Problem: Find All Anagrams in a String
Topic: Sliding Window, Frequency Array, String
Approach: Use two frequency arrays of size 26 to store character counts for the pattern and the current window. Slide a fixed-size window across the string by adding the new character and removing the outgoing character. Compare the frequency arrays at each step to identify anagrams and store their starting indices.
Time Complexity: O(n + m) 
Space Complexity: O(1)
Status: Solved
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        if(k>n){
            return new ArrayList<>();
        }
        int count1[]=new int[26];
        int count2[]=new int[26];
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<k;i++){
            count1[s.charAt(i)-'a']++;
            count2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(count1,count2)){
            al.add(0);
        }
        for(int i=k;i<n;i++){
            count1[s.charAt(i)-'a']++;
            count1[s.charAt(i-k)-'a']--;
            if(Arrays.equals(count1,count2)){
                al.add(i-k+1);
            }
        }

        return al;
    }
}