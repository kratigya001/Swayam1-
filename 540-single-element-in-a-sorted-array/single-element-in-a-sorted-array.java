class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        if(n==1) return nums[0];
       
      
        while(start <=end){
            int mid=(start+end) /2;
            if(mid==0 && nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid==n-1 && nums[mid]!=nums[n-2]) return nums[mid];

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];

            if(mid%2==0){
                if(nums[mid]==nums[mid-1]){//left occur
                    end=mid-1; 
                }
                else{  
                    start=mid+1;  //right
                }
            }
            else{
                if(nums[mid]== nums[mid-1]){
                    start=mid+1; //left
                }
                else{
                    end=mid-1;//right
                }
            }
        }
        return -1;
        
    }
}