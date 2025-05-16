class Solution {
    long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenIndex=(n+1)/2;
        long oddIndex=n/2;
        long even=findPow(5,evenIndex);
        long odd=findPow(4,oddIndex);
        long result=(even*odd)%MOD;
        return (int)result;
    }
    private long findPow(long a,long b){
        if(b==0) return 1;
        long half=findPow(a,b/2);
        long ans=(half*half)%MOD;
        if(b%2==1){ //odd

          ans=(ans*a)%MOD;
        }
        return ans;
    }
}