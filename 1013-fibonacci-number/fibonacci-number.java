class Solution {
    public int fib(int n) {
        int first=0;
        int sec=1;
        int res=0;
        for(int i=0;i<n;i++){
            res=first+sec;
            first=sec;
            sec=res;

        }
        return first;
        
    }
}