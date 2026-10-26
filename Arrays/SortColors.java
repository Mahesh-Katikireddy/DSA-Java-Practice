/*
Platform: LeetCode
Problem Number: 75
Problem: Sort Colors
Difficulty: Medium
Topic: Array, Two Pointers, Sorting

Approach: Use the Dutch National Flag algorithm with three pointers: low, mid, and high. The low pointer tracks the position for 0s, mid traverses the array, and high tracks the position for 2s. If nums[mid] is 0, swap it with nums[low] and increment both low and mid. If nums[mid] is 1, increment mid. If nums[mid] is 2, swap it with nums[high] and decrement high. Continue until mid exceeds high.

Time Complexity: O(n)
Space Complexity: O(1)
Status: Solved
*/

class Solution {
    public void sortColors(int[] nums) {
         int  c0=0,c1=0,c2=0;
         int n=nums.length;
         for(int i=0;i<n;i++)
         {
            if(nums[i]==0)
              c0++;
            else if(nums[i]==1)
              c1++;
            else
              c2++;
         } 
         int k=0;
         while(c0>0)
         {
            nums[k]=0;
            k++;
            c0--;
         }
         while(c1>0)
         {
            nums[k]=1;
            k++;
            c1--;
         }
         while(c2>0)
         {
            nums[k]=2;
            k++;
            c2--;
         }
    }
}