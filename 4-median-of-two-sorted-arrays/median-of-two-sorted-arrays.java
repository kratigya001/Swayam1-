class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int temp []=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                temp[k++]=nums1[i++];

            }
            else{
                temp[k++]=nums2[j++];
            }
        }
        while(i<n1){//if i is reamining
            temp[k++]=nums1[i++];
        }
        while(j<n2){
            temp[k++]=nums2[j++];
        }
        int t=temp.length;
        if(t%2 !=0){//odd
            return (temp[t/2]);

        }
        else{
            return (temp[t/2]+temp[(t/2)-1])/2.0;
        }
      //  return -1;

        

        
    }
}