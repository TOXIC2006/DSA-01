class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<Pair>  pq=  new PriorityQueue<>(
            (a,b)->{
                return b.dis-a.dis;
            });

             int n= arr.length;
         List<Integer> st = new ArrayList<>();

          int ans[]=  new int[n];
          // new array
          for( int i=0;i<n;i++){
             ans[i]=Math.abs(arr[i]-x);
          }
          for( int i=0;i<k;i++){
             Pair p= new Pair(ans[i],arr[i]);
             pq.add(p);
          }
          for( int i=k;i<n;i++){
             if(ans[i]<pq.peek().dis){
                pq.remove();
                 Pair n1= new Pair(ans[i],arr[i]);
                 pq.offer(n1);
             }
          }
          for( int i=0;i<k;i++){
               st.add(pq.remove().val);
          }
          Collections.sort(st);
          return st;
    }
    static  class Pair{
         int dis;
         int val;
         Pair( int x, int y){
             dis=x;
             val=y;

         }


    }
}