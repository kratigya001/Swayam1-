class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ind = 0;
        int sum =0 , rem = 0;
        for(int i = 0 ; i < gas.length ; i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                rem += sum;
                ind = i + 1;
                sum =0;
            }
            // System.out.println(sum +" " + rem);
        }
        if(sum + rem < 0)
            return -1;
        return ind;
    }
}