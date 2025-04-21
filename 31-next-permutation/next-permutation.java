class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        //find breaking point
            while(i>=0 && nums[i]>=nums[i+1]){
                i--;
            }
            if(i==-1){
                reverse(nums,i+1,n-1);
                return;
            }
            int k=n-1;
            while(k>=0 && nums[k] <= nums[i]){
                k--;
            }
            //swap
            int temp= nums[k];
            nums[k]=nums[i];
            nums[i]=temp;
          //  int []arr= new int[n];
         
            //now reverse the 2 half
           reverse(nums,i+1,n-1);
    }
    private void reverse(int []arr,int i,int k){
        while(i<k){
            int temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
            i++;
            k--;
        }
    }

}