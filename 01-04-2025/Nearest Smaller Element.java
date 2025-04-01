package Swayam1-.01-04-2025;

public class Nearest Smaller Element {
    public class Solution {
        public int[] prevSmaller(int[] A) {
            int n=A.length;
            int result[]=new int [n];
            Stack<Integer>st=new Stack<>();
            for(int i=0;i<n;i++){
                while(!st.isEmpty()&& A[i]<= st.peek()){
                    st.pop();
                }
                int smaller= st.isEmpty() ? -1 : st.peek();
                result[i]=smaller;
                st.push(A[i]);
                
            }
            return result;
        }
    }
    
    
}
