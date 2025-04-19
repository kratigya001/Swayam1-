class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return helper(nums,upper)- helper(nums,lower-1);

        
    }
    private long helper(int arr[],int val){
        long ans=0;
        int j=arr.length-1;
        for(int i=0;i<j;i++){
            while(i<j && arr[i]+ arr[j] > val){
                j--;
            }
            ans += (j-i) ;
        }
        return ans;
    }
}