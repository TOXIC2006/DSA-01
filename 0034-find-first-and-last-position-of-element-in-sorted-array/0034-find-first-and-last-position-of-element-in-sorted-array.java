class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]= new int[2];
           int l=0;
           int r= nums.length-1;
            int a1=-1;
            int a2=-1;
             while(l<=r){
                 int mid= l+(r-l)/2;
                 if( nums[mid]>target){
                     r=mid-1; 
                 }else if(nums[mid]<target){
                    l=mid+1;  
                 }else{
                     r=mid-1;
                     a1=mid;
                 }
             } 
             l=0;
              r=nums.length-1; 
              while(l<=r){
                 int mid= l+(r-l)/2;
                 if( nums[mid]>target){
                     r=mid-1; 
                 }else if(nums[mid]<target){
                    l=mid+1;  
                 }else{
                      a2=mid;
                     l=mid+1;
                   
                 }
             } 
             ans[0]=a1;
             ans[1]=a2;
             return ans;
    }
}