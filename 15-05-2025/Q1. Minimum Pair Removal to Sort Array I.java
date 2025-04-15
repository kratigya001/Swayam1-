package Swayam1-.15-05-2025;

public class Q1. Minimum Pair Removal to Sort Array I {
    class Solution {
        public int minimumPairRemoval(int[] nums) {
            int n= nums.length;
            int count=0;
            for(int i=0;i<n-1;i++){
                if(nums[i]>nums[i+1]){
                   count++;
                }
            }
            return count;
                    
            
            
        }
    }
    
}
