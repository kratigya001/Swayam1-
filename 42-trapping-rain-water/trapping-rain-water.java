class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]= new int[n];
        int trapping=0;
        //calculate left max
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);

        }
        //rightmax
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(left[i],right[i]);
            trapping += waterlevel- height[i]; 


        }
        return trapping;
        
    }
}