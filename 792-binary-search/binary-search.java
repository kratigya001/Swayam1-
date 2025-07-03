class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        //if(n==1 && target== nums[0]) return 0; 
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]== target) return mid;
            if(nums[mid]>target){
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }
        return -1;
    }
}