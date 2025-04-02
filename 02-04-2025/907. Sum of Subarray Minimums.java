package Swayam1-.02-04-2025;

public class 907. Sum of Subarray Minimums {
    class Solution {
        public int sumSubarrayMins(int[] arr) {//brute
             int n=arr.length;
            // int sum=0;
            // int mod= 1000000007;
            // for(int i=0;i<n;i++){
            //     int min=arr[i];
            //     for(int j=i;j<n;j++){
            //         min=Math.min(min,arr[j]);
                
            //         sum = (sum+min)% mod; 
            //     }
    
            // }
            // return sum;
    
          //  optimal-
          int []left=new int [n];
          int []right=new int [n];
          int []multiply=new int [n];
         for(int i=0;i<n;i++){
             left[i]= i - nsl(i);
             right[i]= nsr(i)-i;
             multiply[i]=left[i] * right[i]; 
          }
          int totalsum=0, sum=0;
          for(int i=0;i<n;i++){
            totalsum = multiply[i] * i ;
          }
          sum +=totalsum;
          return sum;
        }
        private int nsl(int[] nums){
            int n=arr.length;
            Stack<Integer>st=new Stack();
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && nums[i]<st.peek()){
                    st.pop();
    
                }
                int smalleft=(st.isEmpty)?-1 :st.peek();
                st.push(nums[i])
    
            }
            return smalleft;
    
        }
            private int nsr(int[] nums){
            int n=arr.length;
            Stack<Integer>st=new Stack();
            for(int i=n-1;i>=0;i++){
                while(!st.isEmpty() && nums[i]<st.peek()){
                    st.pop();
    
                }
                int smallright=(st.isEmpty)? n :st.peek();
                st.push(nums[i])
    
            }
            return smallright;
    
        }
    }
    
    
    
    
         
    
    
    
      
    
}
