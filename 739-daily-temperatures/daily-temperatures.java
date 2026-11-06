class Solution {
    public int[] dailyTemperatures(int[] temp) {
         Stack<Pair> st= new Stack<>();
          int n= temp.length;
           int i= n-2;
             int  ans[]= new int[n];

            ans[n-1]= 0;
             Pair p= new Pair(temp[n-1], n-1 );

            st.add(p);
            while(i>=0){
                 if(!st.isEmpty() && st.peek().val>temp[i]){
                     ans[i]=st.peek().index-i;
                     Pair pa= new Pair(temp[i], i );
                     st.add(pa);
                     i--;
                 }else{
                    if(st.isEmpty()){
                        ans[i]=0;
                       Pair em= new Pair(temp[i], i );
                       st.add(em);
                       i--;
                    }else{
                         st.pop();
                    }

                 }
            }
             return ans;

        
    }
    static   class  Pair{
         int val;
          int  index;

           Pair( int v, int in){
               val= v;
                index= in;
           }
    }
}