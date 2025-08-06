class Solution {
    public double myPow(double x, int n) {//binary exponention]
    
        return helper(x,(long)n);
        
    }
    private double helper(double x, long n){
        if(n==0) return 1;
        if(n<0){
            return 1/helper(x,-n);
        }
        if(n%2==0){
            return helper(x*x, n/2);  //binary exp- power is half and x is twice
        }
        else{
            return x * helper(x*x, (n-1)/2);
        }

    }

}