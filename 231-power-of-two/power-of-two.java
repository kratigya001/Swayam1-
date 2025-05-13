class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
        
    }
}//bitwise - 8=1000
       //      7=0111 
         //  and =0000
