class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashMap<Integer,Integer>hm= new HashMap<>();
        Stack<Integer>st= new Stack<>();
        for(int i=n2-1;i>=0;i--){

            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            int greater=(st.isEmpty()?-1 :st.peek());
            hm.put(nums2[i],greater);
            st.push(nums2[i]);

        }
        int ans[]= new int [n1];
        for(int i=0;i<n1;i++){
            ans[i]=hm.getOrDefault(nums1[i], -1);

        }
        return ans;
        
    }
}