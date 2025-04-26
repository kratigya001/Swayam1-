class Solution {
    public int[] prevSmaller(int[] arr){
        int n = arr.length;
        int[] prev = new int[n];
        prev[0] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]) stack.pop();
            if(stack.isEmpty()) prev[i] = -1;
            else prev[i] = stack.peek();
            stack.push(i);
        }
        return prev;
    }
    public int[] nextSmaller(int[] arr){
        int n = arr.length;
        int[] next = new int[n];
        next[n-1] = n;
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]) stack.pop();
            if(stack.isEmpty()) next[i] = n;
            else next[i] = stack.peek();
            stack.push(i);
        }
        return next;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] prev = prevSmaller(arr);
        int[] next = nextSmaller(arr);
        int mod = (int)(1e9)+7;
        int sum = 0;
        for(int i=0;i<n;i++){
            long contri = (long)(i-prev[i])*(long)(next[i]-i)*arr[i];
            int contrifinal = (int)(contri%mod);
            sum = (sum+contrifinal)%mod;
        } 
        return sum;
    }
}