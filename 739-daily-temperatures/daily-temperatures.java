class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> st= new Stack<>();
         int n= temperatures.length;

          int i= n-2;
          
          Pair la= new Pair(temperatures[n-1],n-1);
          st.push(la);

          int ans[]= new  int[n];
          ans[n-1]=0;
          if (n == 0) return new int[0];
        
          while(i>=0){
             if(!st.isEmpty() && temperatures[i]<st.peek().num){
                  ans[i]=st.peek().index-i;
                   Pair a= new Pair(temperatures[i],i);
                   st.push(a);
                   i--;

             }else{
                 if(st.isEmpty()){
                    ans[i]=0;
                    Pair p= new Pair(temperatures[i],i);
                    st.push(p);
                     i--;
                 }else{
                    st.pop();
                 }
             }

            
          }
          return ans;
    }
    static class  Pair{
         int num;
         int index;
          Pair( int x, int y){
             num=x;
             index=y;
          }
    }
}