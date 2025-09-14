class Solution {
    public int findGCD(int[] nums) {

       // check all numbers from 1 to min(low, high) and find the largest i that divides both.

        Arrays.sort(nums);
        int n=nums.length;
        int low=nums[0];
        int high=nums[n-1];
        int gcd=1;
        for(int i=1;i<=low;i++){  //iterate till low
            if(low % i == 0 && high % i==0){
                gcd=i;
            }
        }
        return gcd;
    }
      
}