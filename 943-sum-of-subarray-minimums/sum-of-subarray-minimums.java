class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] prev = prevSmallerIndex(arr);
        int[] next = nextSmallerIndex(arr);
        long sum = 0;
        int mod = (int)(1e9)+7;
        for(int i=0;i<n;i++){
            int left = i - (prev[i]+1) + 1;
            int right = (next[i]-1) - i + 1;
            long total = (long)left * (long)right;
            System.out.println(i + "=>" + total);
            sum = (sum + total*arr[i])%mod;
        }
        return (int)sum;
    }
    int[] nextSmallerIndex(int[] nums){
        int[] ans = new int[nums.length];
        int n = nums.length;
        ans[n-1] = n;
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        int index = n-2;
        while(index>=0){
            while(!stack.isEmpty() && nums[index]<nums[stack.peek()]) stack.pop();
            if(stack.isEmpty()) ans[index] = n;
            else ans[index] = stack.peek();
            stack.push(index);
            index--;
        }
        return ans;
    }
    int[] prevSmallerIndex(int[] nums){
        int[] ans = new int[nums.length];
        int n = nums.length;
        ans[0] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int index = 1;
        while(index<n){
            while(!stack.isEmpty() && nums[index]<=nums[stack.peek()]) stack.pop();
            if(stack.isEmpty()) ans[index] = -1;
            else ans[index] = stack.peek();
            stack.push(index);
            index++;
        }
        return ans;
    }
}