/*
Platform: LeetCode
Problem Number: 796
Problem: Rotate String
Difficulty: Easy
Topic: String, String Matching

Approach: Concatenate the string s with itself (s + s). If goal is a substring of the concatenated string and both strings have equal lengths, return true. Otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(n)
Status: Solved
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}