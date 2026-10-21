class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.dis - a.dis
        );//max heap
        for( int i=0;i<k;i++){
               Pair pair= new Pair(dis(points[i][0],points[i][1]),i);
               pq.add( pair);
        }
        int n=points.length;
        for( int i=k;i<n;i++){
             int distance= dis(points[i][0],points[i][1]);
             if(distance<pq.peek().dis){
                pq.remove();
                Pair pair= new Pair( distance,i);
                pq.add(pair);
             }
        }
         int  ans[][]= new int [k][2];
        for( int i=0;i<k;i++){
            Pair a = pq.remove();
             ans[i][0]=points[a.ind][0];
             ans[i][1]=points[a.ind][1];
        }
         return ans;

    }
     static  int dis( int x,int y ){
         return x*x+y*y;
     }
     static class Pair{
         int dis;
         int ind;
          Pair(int x,int y){
              dis= x;
              ind=y;
          }
     }
}