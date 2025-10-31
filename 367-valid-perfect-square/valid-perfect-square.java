class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0) return false;
        for(long i=0;i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
        
    }
}