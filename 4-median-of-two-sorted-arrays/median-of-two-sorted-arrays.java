import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1 + n2];
        int n = arr.length;

        int i;
        for (i = 0; i < n1; i++) {
            arr[i] = nums1[i];
        }

        int j = 0;
        for (j = 0; j < n2; j++) {
            arr[i] = nums2[j];
            i++;
        }
        Arrays.sort(arr);
        if (n % 2 == 0) {
            double ans = (arr[(n / 2) - 1] + arr[n / 2])/2.0;
            return ans;
        } else {
            double ans = (double) arr[n / 2];
            return ans;
        }
    }
}