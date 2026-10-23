class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n= nums.length;
         int ans[]= new int[n];
         int modi[]= new int[2*n];
          int i=0;
           while( i<2*n){
             modi[i]= nums[i%n];
              i++;
           }
           Stack<Integer> st= new Stack<>();
            int  l= 2*n-2;
             
             st.push(modi[2*n-1]);

              while(l>=0){
                 if(!st.isEmpty() && modi[l]<st.peek()){
                     if( l>=n){
                        st.push(modi[l]);
                     }else{
                          ans[l]=st.peek();
                          st.push(modi[l]);
                     }
                     l--;

                 }else{
                     if(st.isEmpty()){
                         if( l>=n){
                        st.push(modi[l]);
                          }else{
                          ans[l]=-1;
                          st.push(modi[l]);
                         
                     }
                     l--;

                     }else{
                        st.pop();
                     }
                 }
                 

              }
               return ans;
    }
}