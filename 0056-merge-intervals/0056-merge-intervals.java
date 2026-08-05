

class Solution {
    public int[][] merge(int[][] intervals) {
         if (intervals == null || intervals.length == 0) return new int[0][0];
         
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 

         int n = intervals.length;
         List<List<Integer>> list2D = new ArrayList<>();
         
         int start1 = intervals[0][0];
         int end1 = intervals[0][1];

         for (int i = 1; i < n; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (end1 >= start2) {
               
                 end1 = Math.max(end1, end2);
            } else {
                 list2D.add(new ArrayList<>(List.of(start1, end1)));
                 start1 = intervals[i][0];
                 end1 = intervals[i][1];
            }
         }
         
        // adding  the last element
         list2D.add(new ArrayList<>(List.of(start1, end1)));

         return list2D.stream()
                     .map(row -> row.stream().mapToInt(i -> i).toArray())
                     .toArray(int[][]::new);
    }
}
