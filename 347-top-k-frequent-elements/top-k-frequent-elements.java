import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(// mieap
            (a, b) -> a.fre - b.fre
        );

        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1); //storing fre
        }

        //main logic
        for (var e : map.entrySet()) {
            int num = e.getKey();
            int fre = e.getValue();
            Pair ele = new Pair(num, fre);
            if (pq.size() < k) {
                pq.offer(ele);
            } else if (fre > pq.peek().fre) {
                pq.poll();
                pq.offer(ele);
            }
        }

        int[] ans = new int[k];
        int i = 0;

        while (!pq.isEmpty()) {
            ans[i++] = pq.poll().num;
        }

        return ans;
    }

    static class Pair {
        int num;
        int fre;

        Pair(int n, int f) {
            num = n;
            fre = f;
        }
    }
}