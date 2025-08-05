class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        //- BRUTE FORCE
        // HashSet<List<Integer>>hs=new HashSet<>();
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer>triplet=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 hs.add(triplet);


        //             }

        //         }
        //     }
        // }
        // return new ArrayList<>(hs);
        
        //optimal
        List<List<Integer>>al=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;//skip dupliacte
            int j=i+1;
            int k=n-1;
            while(j<k){

                int sum=nums[i]+nums[j]+nums[k];
                if(sum > 0){
                    k--;
                }
                else if (sum <0){
                    j++;
                }
                else{
                    List<Integer>triplet=Arrays.asList(nums[i],nums[j],nums[k]);
                    al.add(triplet);
                    j++;
                    k--;
                    //skip duplicate
                     while(j<k && nums[j]==nums[j-1]) j++;
                     while(j<k && nums[k]==nums[k+1]) k--;

                }
            }
        }
        return al;
        


    }
}