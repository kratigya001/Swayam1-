class Solution {
    public boolean isValid(String s) {
        //keypoints
       // 1.Stack mai character daalna hai 
     //  2.String ko chararray bnao
        Stack<Character> st= new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty() || ch=='('||ch=='{'||ch=='['){
                st.push(ch);

            }
            if(ch==')'){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            if(ch=='}'){
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
             if(ch==']'){
                if(st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();


        
    }
}