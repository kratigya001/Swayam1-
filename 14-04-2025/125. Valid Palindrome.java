package Swayam1-.14-04-2025;

public class 125. Valid Palindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            String str= s.toLowerCase();
            str= str.replaceAll("[^a-z0-9]","");
            int n=str.length();
            int left=0;
            int right=n-1;
            while(left<right){
                if(str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
    
          
    
            
        }
    }
    
}
