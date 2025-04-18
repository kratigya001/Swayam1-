package Swayam1-.29-03-2025;

public class 225. Implement Stack using Queues {
    class MyStack {
        private Queue<Integer>q;
     
         public MyStack() {
             q=new LinkedList<>();
         }
         
         public void push(int x) {
             q.add(x);
             for(int i=0;i<q.size()-1;i++){
                 q.add(q.poll());
             }
             
         }
         
         public int pop() {
            return q.poll();
             
         }
         
         public int top() {
           return  q.peek();
             
         }
         
         public boolean empty() {
             if(q.isEmpty()){
                 return true;
             }
             return false;
             
         }
     }
     
     /**
      * Your MyStack object will be instantiated and called as such:
      * MyStack obj = new MyStack();
      * obj.push(x);
      * int param_2 = obj.pop();
      * int param_3 = obj.top();
      * boolean param_4 = obj.empty();
      */
    
}
