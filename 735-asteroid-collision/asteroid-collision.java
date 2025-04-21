class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
      //  int sum=0;
        for(int a: asteroids){
         
            //coillion occur
            while(!st.isEmpty() && a<0 && st.peek()>0 ){
                 int sum=st.peek()+ a;
                 if(sum >0){//positive
                   a=0;//exploide

                 }
                 else if(sum <0 ){
                    st.pop();
                 }
                 else{ //sum==0
                    a=0;
                    st.pop();
                 }
            }
            if(a!=0){
                st.push(a);
            }
        }
        int arr[]=new int [st.size()];
      //  int new1 []= new int[st.size()];
       
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
        
    }
}