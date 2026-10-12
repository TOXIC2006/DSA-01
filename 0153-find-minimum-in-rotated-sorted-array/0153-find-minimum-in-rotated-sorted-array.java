class Solution {
    public int findMin(int[] nums) {
      int n= nums.length;
      // time complexity O(n)
      int   l=0;
       int r= n-1;
       int ans=0;
       while(l<=r){
         int  mid=l+(r-l)/2;
       
         if(nums[mid]>nums[n-1]){
              l=mid+1;
         }else{
             ans=mid;
             r=mid-1;
         }
       }
       return nums[ans];
 }
}