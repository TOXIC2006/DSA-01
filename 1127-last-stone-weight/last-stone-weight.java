class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(
            Collections.reverseOrder()); 
         
         int n= stones.length;
          if( n==1){
             return stones[0];
          }
         for( int i=0;i<n;i++){
             pq.offer(stones[i]);
         }
         while(pq.size()>1){
              int y= pq.remove();// largest
               int x= pq.remove();       // secound larg4est
            
                 if(x!=y){
                     int num=y-x;
                     pq.offer(num);
                 }
                 
         }
         if( pq.isEmpty()){
             return 0;
         }
         return pq.peek();
    }
}