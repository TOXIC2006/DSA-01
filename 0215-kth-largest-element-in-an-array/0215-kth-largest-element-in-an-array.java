class Solution {
    public int findKthLargest(int[] nums, int k) {
         if( nums.length==1){
            return nums[0];
         }
         Arrays.sort(nums);
          int ele=0;
          int i;
          for(  i=nums.length-1;i>=nums.length-k+1;i--){
             
          }
          return nums[i];
    }
}