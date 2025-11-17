class Solution {
    public int climbStairs(int n) {
        //see its factorial 
        int a=1;
        int b=1;
        if(n==1) return 1;
        int sum=0;
        for(int i=1;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;

        }
        return sum;
        
    }
}