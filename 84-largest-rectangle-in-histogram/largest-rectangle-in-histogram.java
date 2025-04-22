class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nsl= new int [n];
        int []nsr= new int [n];
        int maxarea=0;

        //nsr -- to calculate nsr write logic of nge(next graeter element) but change only sign(<)
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                st.pop();

            }
            nsr[i]= st.isEmpty()? n : st.peek();
            st.push(i); // index push
        }
        //nsl  -- to calculate nsl write nsr but itearte the loop from beginning 

        st= new Stack<>();  //only call st with new data
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                st.pop();

            }
            nsl[i]= st.isEmpty()? -1 : st.peek();
            st.push(i);
        }
        //width= j-i-1 => nsr[i]-nsl[i]-1
        for(int i=0;i<n;i++){
            int h= heights[i];
            int width=nsr[i]-nsl[i]-1;
            int area=h* width;
            maxarea= Math.max(area,maxarea);
        }
        return maxarea;

        
        
    }
}  