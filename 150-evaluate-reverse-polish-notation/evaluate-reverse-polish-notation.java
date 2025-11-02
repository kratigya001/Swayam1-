class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st= new Stack<>();
        int i=0;
        while(i<tokens.length){
            String ch=tokens[i];
            if(ch.equals("+")){
               int a=st.pop();
               int b=st.pop();
                st.push(a+b);
            }
            else if(ch.equals("-")){
                int a=st.pop();//second
                int b=st.pop();//first
                st.push(b-a);

            }
              else if(ch.equals("*")){
                int a=st.pop();
                int b=st.pop();
                st.push(a*b);

            }
              else if(ch.equals("/")){
                int a=st.pop();//second
                int b=st.pop();//first
                st.push(b/a);
            }
            else{
                st.push(Integer.valueOf(ch));
            }
            i++;

        }
        return st.pop();
    }
}