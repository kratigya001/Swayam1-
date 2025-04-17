public class 224. Basic Calculator {
    class Solution {
        public int calculate(String s) {
            int num=0;
            int res=0;
            int sign=1;
            Stack<Integer>st= new Stack();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if( Character.isDigit(ch)){
                    num= num* 10 +(ch-'0');
                }
                else if(ch =='+'){
                    res += num*sign;
                    num=0;
                    sign=+1;
    
                }
                  else if(ch =='-'){
                    res += num*sign;
                    num=0;
                    sign=-1;
    
                }
                else if(ch== '('){
                    st.push(res);
                    st.push(sign);
                    res =0;
                    sign=1;
                }
                else if(ch ==')'){
                    res+= num*sign; //bracket s phle ka
                    num=0; // aage wala exp k liye
                    res *= st.pop();//sign pop
                    res += st.pop(); // num pop
    
                }
            }
            res+= num*sign; // for last digit remaining
            return res; 
    
            
        }
    }
    
}
