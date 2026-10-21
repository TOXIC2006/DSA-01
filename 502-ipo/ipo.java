
import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;

        int[][] gain = new int[n][2];

        for (int i = 0; i < n; i++) {
            gain[i][0] = capital[i];
            gain[i][1] = profits[i];
        }//sort
        Arrays.sort(gain, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        for (int j = 0; j < k; j++) {
            while (i < n && gain[i][0] <= w) {
                pq.add(gain[i][1]);
                i++;
            }
            if (pq.isEmpty()) {
                break;
            }
              w= w+ pq.poll();
        }

        return w;
    }
}
