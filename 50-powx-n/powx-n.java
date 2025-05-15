class Solution {
    public double myPow(double x, int n) {// i am not using Math.pow()
         return solve(x,(long)n);
        
    }
    private double solve(double x, long n){
        if(n==0) return 1; //base

         if(n <0){ //-ve n
           return solve((1/x) , -n);
        }
        else if( n %2 ==0){ //even n
           return  solve( x*x , n/2);
        }
        else{ //odd
           return  x* solve(x*x, (n-1)/2);
        }

    }
}