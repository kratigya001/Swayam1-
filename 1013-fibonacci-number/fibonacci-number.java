class Solution {
    public int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        int first=0;
        int sec=1;
        int res=0;
        int i=1;
        while(i!=n){
            res=first+sec;
            first=sec;
            sec=res;
            i++;

        }
        return res;


    }
}