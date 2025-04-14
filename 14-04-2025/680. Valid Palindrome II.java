package Swayam1-.14-04-2025;

public class 680. Valid Palindrome II {
    class Solution {
        public boolean validPalindrome(String s) {
            int n=s.length();
            int left=0;
            int right=n-1;
            while(left<right){
                if(s.charAt(left) != s.charAt(right)){
                    return ispalindrome(s,left+1,right) || ispalindrome(s,left,right-1);
                }
                left++;
                right--;
            }
           return true;
    
        }
        private boolean ispalindrome(String s, int left,int right){
            while(left<right){
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    
    }
    
}
