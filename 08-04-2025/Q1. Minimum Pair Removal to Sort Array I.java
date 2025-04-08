package Swayam1-.08-04-2025;

public class Q1. Minimum Pair Removal to Sort Array I {
    class Solution {
        public int minimumPairRemoval(int[] nums) {
           
            int operations = 0;
    
            while (!ascecnding(nums)) {
                int minSum = Integer.MAX_VALUE;
                int index = 0;
    
               
                for (int i = 0; i < nums.length - 1; i++) {
                    int sum = nums[i] + nums[i + 1];
                    if (sum < minSum) {
                        minSum = sum;
                        index = i;
                    }
                }
    
           
                int[] nayiarr = new int[nums.length - 1];
                int j = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (i == index) {
                        nayiarr[j++] = nums[i] + nums[i + 1];
                        i++; 
                    } else {
                        nayiarr[j++] = nums[i];
                    }
                }
    
                nums = nayiarr; 
                operations++;
            }
    
            return operations;
        }
    
        
        private boolean ascecnding(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) return false;
            }
            return true;
    
            
        }
    }
    
}
