class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
       PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
              if (b.fre != a.fre) {
                return b.fre - a.fre;
             }
            return a.str.compareTo(b.str);
         });

         Map<String, Integer> map = new HashMap<>();

         for(var v: words){
            map.put(v,map.getOrDefault(v,0)+1);
         }

          List<String>  ans= new ArrayList<>();

         for( var e:map.entrySet()){
            pq.offer( new Pair(e.getValue(),e.getKey()));
         }
         for( int i=0;i<k;i++){
            Pair p= pq.remove();
             ans.add(p.str);
         }
         return  ans;

    }
    static  class Pair{
         int fre;
          String str;
          Pair( int fr,String st){
            fre=fr;
            str=st;

          }
    }
}