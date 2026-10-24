class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int n= arr.length;
        int l=0;
         int r= n-1;
         int ans=0;
          while( l<=r){
             int mid=l+(r-l)/2;
             int target=arr[mid];
             if(target>arr[mid+1]){
                 
                 r=mid-1;
             }else{
                ans=mid;
                l=mid+1;
             }

          } 
        return  ans+1;
    }
}