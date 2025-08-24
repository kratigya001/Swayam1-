class Solution {
    public int splitArray(int[] nums, int k) {
        //similar to book aloocation
        int low=max(nums);
        int high=sum(nums);
        int n=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(nums,mid)<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low; //bcz concept of  low & high by striver
    }
    private int helper(int []nums,int mid){
        int student=1;
        int page=0;
        for(int i=0;i<nums.length;i++){
            if(page+nums[i]<=mid){
                page += nums[i]; 
            }
            else{
                student++;
                page=nums[i];
            }
        }
        return student;
    }
    private int max(int[] arr){
        int m=Integer.MIN_VALUE;
        for(int ans:arr){
            m=Math.max(m,ans);
        }
        return m;
    }
    private int sum(int[]arr){
        int ans=0;
        for(int a:arr){
            ans+= a;
        }
        return ans;
    }
}