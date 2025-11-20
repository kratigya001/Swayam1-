class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

       //1. Make an array of pairs → {value, index}.
     //2. Sort by value (descending).
    //3. Take first k elements → these are the biggest.
    //4. Sort these k elements by index → to restore original order.
    //5. Take their values → final answer.

        int n=nums.length;
        int [][]arr= new int [n][2];
         // store {value, index}
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr, (a,b)-> b[0]-a[0]); // sort by value descending

        int [][]pick= new int [k][2]; // pick k largest
        for(int i=0;i<k;i++){
            pick[i] = arr[i];
        }

        // sort selected k by original index
        Arrays.sort(pick, (a,b)-> a[1]-b[1]);
        
        int temp[]= new int [k];
        for(int i=0;i<k;i++){
            temp[i]=pick[i][0];
        }
        return temp;



    }
}