class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int gassum=0;
        int totalcost=0;
        for(int i=0;i<n;i++){
            gassum += gas[i];
        }
        for(int i=0;i<n;i++){
            totalcost += cost[i];
        }
        if(gassum < totalcost){
            return -1;
        }
        int sum=0;
        int index=0;
        for(int i=0;i<n;i++){
            sum += gas[i]-cost[i];

            if(sum <0){
                index= i+1;
                sum=0;
            }
           

        }
        return index;
    
    }
}