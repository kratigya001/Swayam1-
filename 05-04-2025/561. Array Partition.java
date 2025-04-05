package Swayam1-.05-04-2025;

public class 561. Array Partition {
    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
         //   int sum=0;
            int ans=0;
    
            for(int i=0;i<nums.length; i+=2){    // i=i+2;
                ans += nums[i];
             
                System.out.println(ans);
            }
         //   sum=sum+ans;
            return ans;
            
        }
    }
    
}
