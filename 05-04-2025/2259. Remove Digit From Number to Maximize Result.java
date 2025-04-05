package Swayam1-.05-04-2025;

public class 2259. Remove Digit From Number to Maximize Result {
    class Solution {
        public String removeDigit(String number, char digit) {
            int n=number.length();
           // StringBuilder str=new StringBuilder();
            for(int i=1;i<n;i++){
                if(number.charAt(i-1) == digit){
                   if(number.charAt(i-1) < number.charAt(i)){
                    return number.substring(0,i-1) + number.substring(i);
                   }
                } 
            }
            //if all are small then we remove last index digit
            int lastindex = number.lastIndexOf(digit);
            return number.substring(0,lastindex) + number.substring(lastindex+1); 
        
            
    
            
        }
    }
    
}
