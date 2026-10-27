/*
Platform: LeetCode
Problem Number: 205
Problem: Isomorphic Strings
Difficulty: Easy
Topic: String, HashMap

Approach: First, check whether both strings have the same length. Use a HashMap to store the mapping between characters in s and characters in t. Traverse both strings simultaneously. If a character from s already exists in the map, verify that it maps to the corresponding character in t. Otherwise, check whether the target character is already mapped to another character using map.containsValue(). If it is, return false; otherwise, create the mapping. If all characters satisfy the conditions, return true.

Time Complexity: O(n) average for a fixed character set
Space Complexity: O(1) for a fixed character set
Status: Solved
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                char ch=map.get(s.charAt(i));
                if(ch!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
            
        }

        return true;
    }
}