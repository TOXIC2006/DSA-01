class Solution {
    public int shipWithinDays(int[] w, int days) {
         int sum=0;
         int max=Integer.MIN_VALUE;
       for(var x:w){
           sum=sum+x;
           max=Math.max(max,x);
       } 
       int r=sum;
       int l=max;
       int ans=0;
       while(l<=r){
          int mid=l+(r-l)/2;
          int asked=helper( mid ,w);
          if(asked<=days){
             ans=mid;
             r=mid-1;
          }else{
           
             l=mid+1;
          }
       }
       return ans;

    }
    static  int helper( int mid,int arr[]){
         int days=0; int sum=0;
        for( int i=0;i<arr.length;i++){
             if( sum<=mid){
                sum=sum+arr[i];
             }
             if(sum>mid){
                sum=0;
                 days++;
                 i--;
             }
            
        }
        return days+1;
    }
}