/*
Platform: LeetCode
Problem Number: 2149
Problem: Rearrange Array Elements by Sign
Difficulty: Medium
Topic: Array, Two Pointers

Approach: Create a new result array of the same length as nums. Use two pointers: positive starts at index 0 and negative starts at index 1. Traverse the input array while preserving the original order of elements. Place positive integers at even indices and negative integers at odd indices, incrementing the respective pointer by 2 after each placement.

Time Complexity: O(n)
Space Complexity: O(n)
Status: Solved
*/

class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       int positive=0,negative=1;
       for(int i=0;i<n;i++)
       {
         if(nums[i]>=0)
         {
            res[positive]=nums[i];
            positive=positive+2;
         }
         else
         {
            res[negative]=nums[i];
            negative=negative+2;
         }
       }
       return res;
    }
}