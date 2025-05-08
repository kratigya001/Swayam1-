class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st= new Stack<>();
        for(int a: asteroids){
            //when collision
            while(!st.isEmpty() && a <0 && st.peek()>0){
                int sum= st.peek() + a ;
                if(sum>0){
                    a=0;
                }
                else if(sum <0){
                    st.pop();
                }
                else{// sum==0
                    st.pop();
                    a=0;
                }

            }
            if(a!=0){
                st.push(a);
            }
        }
        //now convert st into arr
        int res[]= new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}