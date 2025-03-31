package Swayam1-.31-03-2025;

public class 496. Next Greater Element I {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {//optimal
            int n1=nums1.length;
            int n2=nums2.length;
            HashMap<Integer,Integer>hm=new HashMap<>();
            Stack<Integer>st=new Stack<>();
    
            for(int i=n2-1;i>=0;i--){
    
    
                while(!st.isEmpty() && nums2[i]>st.peek()){
                    st.pop();
                }
                int greater= (st.isEmpty() ? -1 : st.peek());
    
                hm.put(nums2[i],greater);
                //push 
                  st.push(nums2[i]);
    
                
            }
            int arr[]=new int [n1];
    
            for(int i=0;i<n1;i++){
                arr[i]=hm.getOrDefault(nums1[i] , -1);
    
            }
            return arr;
       
         
    
        }
    }
    
}
