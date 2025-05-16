class Solution {
     long m= 1000000007;
    public int countGoodNumbers(long n) {
        long even= helper(5, (n+1)/2);
        long odd= helper(4,(n/2)) ;
        long ans=( even* odd) %m;
        return (int) ans;
        
    }
    private long helper(long a,long b){
        if(b==0) return 1;

        long half= helper(a,b/2);
        long result=( half* half) %m ;
        if(b%2==1){
            result= (result*a) %m ;
        }
         return result ;

    }
}