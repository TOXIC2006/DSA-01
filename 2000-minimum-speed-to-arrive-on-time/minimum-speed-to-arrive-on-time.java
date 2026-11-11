class Solution {
    public int minSpeedOnTime(int[] dist, double h) {
      int  l=1;
      int r= 10000000;
      int ans=-1;
       while( l<=r){
         int mid=l+(r-l)/2;
         if(can(mid,dist,h)){
             ans=mid;
             r=mid-1;
         }else{
           l=mid+1;
         }
       }
       return ans;
     }
     static boolean  can( int mid, int [] arr, double h){
         double time=0.0;
         for( int i=0;i<arr.length;i++){
             double sum= (double) arr[i]/mid;
             if(i!=arr.length-1){
                 time+=Math.ceil(sum);
             } else{
                time=time+sum;
             }
         }
         return time<=h;
     }
}