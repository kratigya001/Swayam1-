class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer>st= new Stack<>();
        int []res= new int [n];
        for(int i=n*2-1;i>=0;i--){
            while(!st.isEmpty() && nums[i%n] >= st.peek()){
                st.pop();
            }
            if(i<n){
             res[i]=(st.isEmpty()?-1 : st.peek());
            }
            
            st.push(nums[i%n]);
          

        }
        return res;
       
        
    }
}