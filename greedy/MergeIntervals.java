/*
Platform: LeetCode
Problem Number: 56
Problem: Merge Intervals
Difficulty: Medium
Topic: Array, Sorting, Intervals

Approach: First, sort the intervals in ascending order based on their starting values. Initialize a result array and add the first interval. Traverse the remaining intervals and check whether the current interval overlaps with the last merged interval. If they overlap, update the ending value to the maximum of both ending values. Otherwise, add the current interval as a new interval. Finally, return the result array containing only the merged intervals.

Time Complexity: O(n log n)
Space Complexity: O(n)
Status: Solved
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        int a[][]=new int[intervals.length][2];
        int k=0;
        Arrays.sort(intervals,(b,c)->Integer.compare(b[0],c[0]));
        a[k][0]=intervals[0][0];
        a[k][1]=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=a[k][1]){
                a[k][1]=Math.max(intervals[i][1],a[k][1]);
            }
            else{
                k++;
                a[k][0]=intervals[i][0];
                a[k][1]=intervals[i][1];
                
            }
        }
        return Arrays.copyOf(a,k+1);
    }
}