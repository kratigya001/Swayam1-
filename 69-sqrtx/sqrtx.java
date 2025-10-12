class Solution {
    public int mySqrt(int x) {
      //  if(x<=1) return 1;
        int low=1;
        int high=x;
        int ans=0;
        while(low<=high){
            int mid=low +(high-low) /2;

            long sq=(long) mid* mid;//overflow
            if(sq <= x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans;
        
    }
}