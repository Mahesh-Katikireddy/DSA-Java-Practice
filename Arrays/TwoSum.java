/*Problem: Two Sum
Topic: HashMap
Approach: Calculate the complement (target - nums[i]) and check whether it exists in the HashMap
Time Complexity: O(n)
Space Complexity: O(n)
Status: Solved */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}