package Swayam1-.29-03-2025;

public class 3285. Find Indices of Stable Mountains {
    class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
         int n=height.length;

        ArrayList<Integer>al=new ArrayList<>(n);
        for(int i=1;i<n;i++){
            if(height[i-1]>threshold){
                al.add(i);
            }
        }
        return al;
        
    }
}
}
