class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]== target){
                return mid;
            } 
            //check if left part is sorted or not
            if(arr[low]<=arr[mid]){
                //check it is in range of left
                if(arr[low] <= target && target <= arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //check if right part is sorted or not
            else{
                if(arr[mid]<= target && target <= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }

            }

        }
        return -1;
    }
}