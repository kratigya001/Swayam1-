class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n= matrix[0].length;
        int sum[]= new int [n]; // columnwise 
        int result=0;

        //prefix sum
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == '0'){
                    sum[j]=0;
                }
                sum[j] += (matrix[i][j] -'0');

            }
        
            int maxarea= largesthistogram(sum );
            result= Math.max(result, maxarea);
        }
        return result;

    }
    private int largesthistogram(int [] nums){
        //nsr
        int n=nums.length;

        int []nsr= new int [n];
        Stack<Integer>st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& nums[st.peek()] >= nums[i]){
                st.pop();
            }
            nsr[i]=(st.isEmpty()? n: st.peek() );
            st.push(i);
        }
        //nsl
        int []nsl= new int [n];
        Stack<Integer>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && nums[st1.peek()] >= nums[i]){
                st1.pop();
            }
            nsl[i]= (st1.isEmpty() ? -1 :st1.peek());
            st1.push(i);
        }
        //width  --> j-i-1
        int res=0;
        for(int i=0;i<n;i++){
            int width=nsr[i]- nsl[i] -1;
            int area= width* nums[i];
            res= Math.max(res, area);
        }
        return res;

    }
}