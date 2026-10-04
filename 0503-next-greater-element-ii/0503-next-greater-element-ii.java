
import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        int i = 2 * n - 1;

        while (i >= 0) {
            int idx = i % n;

            while (!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }

            if (i < n && !st.isEmpty()) {
                ans[idx] = st.peek();
            }

            st.push(nums[idx]);
            i--;
        }

        return ans;
    }
}
