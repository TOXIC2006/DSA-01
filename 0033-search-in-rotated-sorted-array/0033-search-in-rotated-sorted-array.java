class Solution {
    public int search(int[] nums, int target) {
         int n=nums.length;
        int  l=0;
         int r= nums.length-1;
         int ans=0;
          while(l<=r){
              int mid= l+(r-l)/2;
               if(nums[mid]>nums[n-1]){
                   l=mid+1;
               }else{
                   ans=mid;
                   r=mid-1;
               }
          }  
           int  ans1=binary(nums,0,ans-1,target);
           int ans2=binary(nums,ans,n-1,target);

           if(ans1==-1 && ans2!=-1){
            return ans2;
           }else if(ans1!=-1 && ans2==-1){
            return ans1;
           }else{
             return -1;
           }
          
    }
    public  static  int  binary( int nums[], int l,int r,int target){
          while( l<=r){
             int mid= l+(r-l)/2;
              if(nums[mid]==target){
                 return mid;
              }else if(nums[mid]<target){
                  l=mid+1;
              }else{
                  r=mid-1;
              }
          }
          return -1;
    }
}