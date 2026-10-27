/*
Platform: LeetCode
Problem Number: 125
Problem: Valid Palindrome
Difficulty: Easy
Topic: String, Two Pointers, StringBuilder

Approach: Traverse the input string and keep only alphanumeric characters using Character.isLetterOrDigit(). Convert each character to lowercase and append it to a StringBuilder. Store the cleaned string in a variable and reverse the StringBuilder. Compare the original cleaned string with the reversed string. If both are equal, return true; otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(n)
Status: Solved
*/

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        String s1=sb.toString();
        String s2=sb.reverse().toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}