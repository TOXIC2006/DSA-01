class Solution {
    public int findPeakElement(int[] nums) {
        int  n= nums.length;
         int  l=0;
          int r= n-1;
           int ans=0;
          while(l<r){
             int mid=l+(r-l)/2;
              if(nums[mid]<nums[mid+1]){
                ans=mid;
                 l=mid+1;
               
              }else{
                r=mid;
               
              }
          }

           return l;
    }
}