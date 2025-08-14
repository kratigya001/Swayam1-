class Solution {

    private int helper(int []piles, int speed){
          int n=piles.length;

        int total=0;
        for(int i=0;i<n;i++){
            total+= Math.ceil((double)piles[i]/speed);
        }
        return total;

    }
    public int minEatingSpeed(int[] piles, int h) {
         int n=piles.length;

        Arrays.sort(piles);
        int low=1;
        int high=piles[n-1];
        while(low<= high){
            int mid=(low+high )/2;
            int totalways=helper(piles,mid);
            if(totalways <= h){//slow chalo
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;


   
    }
}