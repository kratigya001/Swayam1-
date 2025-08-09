class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        // int res=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     res=Math.min(res,nums[i]);
        // }
        // return res;

        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            //sorted mai minimum nhi hoga

            //check if left part is sorted
            if(nums[low]<=nums[mid]){
                min=Math.min(min,nums[low]);//nums[low] hi sabse min hoga left mai
                low=mid+1;//right m chle jaaao
            }
            else{
                high=mid-1;
                min=Math.min(min,nums[mid]);//nums[mid] hi sabse min hoga right mai
            }

        }
        return min;


    }
}