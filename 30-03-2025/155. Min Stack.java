package Swayam1-.30-03-2025;

public class 155. Min Stack {
    class Pair{
        int first,second;
        Pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    class MinStack {
        Stack<Pair>st;
    
        public MinStack() {
            st=new Stack<>();
            
        }
        
        public void push(int val) {
            int min;
            if(st.isEmpty()){
                 min=val;
              //  st.push(val,min);
            }
            else{
              min=Math.min(val,st.peek().second);
            }
            st.push(new Pair(val,min));
            
        
        }
        
        public void pop() {
            st.pop();
            
        }
        
        public int top() {
            return st.peek().first;
            
        }
        
        public int getMin() {
            return st.peek().second;
            
        }
    }
    
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    
}
