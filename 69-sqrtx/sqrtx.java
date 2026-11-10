class Solution {
    public int mySqrt(int x) {
        int  l=1;
         int   r=x;
          int ans=0;
          if( x==1){
            return 1;
          }
          while( l<=r) {
               int mid=l+(r-l)/2;
                int find=x/mid;
                if( mid>find){
                    r=mid-1;
        
                }else{
                    ans=mid;
                     l=mid+1;
                      
                }
          }
          return ans;
    }
 
}