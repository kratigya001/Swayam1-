class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int first=0;
        int second=1;
        int i=1;
        int res=0;
        while(i!=n){
            res=first+second;
            first=second;
            second=res;
            i++;
        }
        return res;
    }
}