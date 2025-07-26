class Solution {
    public int climbStairs(int n) {
        //fibonacci
        // Notice the pattern in the examples. To reach the nth step, you must have come from either the (n-1)th step (by taking 1 step) or the (n-2)th step (by taking 2 steps).

// Therefore, the total number of ways to reach the nth step is the sum of:

// The number of ways to reach the (n-1)th step.

// The number of ways to reach the (n-2)th step.


        if (n==1)  return 1;
        int a=1;
        int b=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}