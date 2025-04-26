class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=(int)1e9+7;
        long sum=0;
        int prev[]=prevsmaller(arr);
        int next[]=nextsmaller(arr);
        for(int i=0;i<n;i++){
            int p=i-prev[i];
            int ne=next[i]-i;
           // int mul= p*ne;
            long res=(long)p*(long) ne * arr[i];
            sum= (sum+ res)% mod;

        }
        return (int)sum;
   
    }
    private int[] prevsmaller(int []arr){
        int n=arr.length;
        int []psmall= new int[n];

        Stack<Integer>st= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
             psmall[i]= (st.isEmpty()?-1 :st.peek());
            st.push(i);
        }
        return psmall;
    }
     private int [] nextsmaller(int []arr){
        int n=arr.length;
        int []nsmall= new int[n];

        Stack<Integer>st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
             nsmall[i]= (st.isEmpty()? n :st.peek());
            st.push(i);
        }
        return nsmall;
    }
}