package Swayam1-.29-03-2025;

public class 232. Implement Queue using Stacks {
    class MyQueue {
        private Stack<Integer>input; //this is to add elements
        private Stack<Integer>output;// this is to remove elements
    
        public MyQueue() {
            input=new Stack<>();
            output=new Stack<>();
        }
        
        public void push(int x) {
            input.add(x);
            
        }
        
        public int pop() {
            peek();
            return output.pop();
            
        }
        
        public int peek() {
            if(output.isEmpty()){
                while(!input.isEmpty()){
                    output.push(input.pop());
                }
            }
            return output.peek();
        }
        
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
            
        }
    }
    
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    
}
