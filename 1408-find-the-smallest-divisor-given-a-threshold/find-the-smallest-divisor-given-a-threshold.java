class Solution {
    private int divisor(int nums[],int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= Math.ceil((double)nums[i]/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        int low=1;
        int high=maxi;
        while(low<=high){
            int mid=(low+high) /2;
            if (divisor(nums,mid) <= threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
}