package Swayam1-.07-04-2025;

public class 394. Decode String {
    class Solution {
        public String decodeString(String s) {
            Stack<Integer>numstk= new Stack<>();
            Stack<StringBuilder>strstk= new Stack<>();
            StringBuilder str= new StringBuilder();
            int num=0;
            for(char ch : s.toCharArray()){
                if(Character.isDigit(ch)){
                    num=num *10 + (ch -'0');//for multi value
                }
                else if(ch=='['){
                    numstk.push(num);
                    num=0;  // Reset the number
                    strstk.push(str);
                     str=new StringBuilder();// Start new string for inside the brackets
    
                    System.out.println(strstk);
                    
                }
                else if(ch==']'){
                    int k=numstk.pop();
                     StringBuilder temp=str;
                     str=strstk.pop();// Restore the previous string
    
                    while(k -- >0){
                        str.append(temp);
                    }
    
                }
                else{
                    str.append(ch);
                }
            }
           return str.toString();
    
            
        }
    }
    
}
