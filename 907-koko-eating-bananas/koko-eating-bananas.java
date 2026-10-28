class Solution {
    public int minEatingSpeed(int[] p, int h) {
         int l=1;
           int r= p[0];
           for( int i=1;i<p.length;i++){
                r=Math.max(r,p[i]);
           }
             int res=r;
            while( l<=r){
                int mid= l+(r-l)/2;
                  long ans=helper(p,mid);
                 
                  if(ans<=h){
                     res=mid; 
                       r=mid-1;
                      
                  }else{
                     l=mid+1;
                  }
            }
             return res;
    }
     static long helper( int []p,  int num){
         long sum = 0;
        for( int i=0;i<p.length;i++){
        
            if(p[i] % num == 0){
                sum = sum + p[i] / num;
             } else {
                  sum = sum + p[i] / num + 1;
           }
        }
        return sum;
     }
}