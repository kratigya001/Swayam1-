class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int arr[]= new int [n];
        for(int x=0;x<n;x++){
            for(int i=0;i<n;i++){
                arr[i]=nums[(i+x)% n];
            }
                if (checksort(arr)){
                    return true;
                }
        }
            
        return false;
        
        
    }
    private boolean checksort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
}