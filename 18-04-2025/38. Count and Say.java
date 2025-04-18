public class 38. Count and Say {
    class Solution {
        public String countAndSay(int n) {
            if(n==1){
                return "1";//base case
            }
            String s= countAndSay(n-1);
            //now process
    
    
            StringBuilder res= new StringBuilder("");
            for(int i=0;i<s.length();i++){
                int cnt=1;
    
                char ch= s.charAt(i);
                while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){//for cnt
                    cnt++;
                    i++;
                }
                res.append(cnt).append(ch);
    
            }
            return res.toString();
        }
    }
    
}
