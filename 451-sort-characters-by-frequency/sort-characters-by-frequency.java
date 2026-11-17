class Solution {
    public String frequencySort(String s) {
         PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.fre, a.fre));


          Map<Character,Integer> map= new HashMap<>();
          for(   int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             map.put(ch, map.getOrDefault(ch,0)+1);
          }
          for( var e:map.entrySet()){
               Pair elem=   new Pair(e.getValue(),e.getKey());
               pq.offer(elem);
          }
          int si=pq.size();
          StringBuilder sb = new StringBuilder("");
          for( int i=0;i<si;i++){
              Pair p=pq.remove();
              sb.append(String.valueOf(p.ch).repeat(p.fre));
          }
          String res = sb.toString(); 
          return res;

    }
    static class Pair{
         int fre;
         char ch;
          Pair( int f, char c){
             fre=f;
             ch=c;
          }
    }
}