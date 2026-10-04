class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
          int n= temperatures.length;
           if( n==0){
             return null;
           }
          int ans[]= new int[n];
          Stack<Integer> st= new Stack<>();
          st.push( n-1);
          ans[n-1]=0;
         int i=n-2;
          while( i>=0){
               if(!st.isEmpty() && temperatures[st.peek()]>temperatures[i]){
                  ans[i]=st.peek()-i;
                  st.push(i);
                  i--;
               }else{
                    if( st.isEmpty()){
                         ans[i]=0;
                         st.push(i);
                         i--;
                    }else{
                         st.pop();
                    }

               }

          }
          // use in case of aray list only
        //   Collections.reverse(Arrays.asList(ans));
           return ans;
    }
}