public class GetAverages {

    // You are given a 0-indexed array nums of n integers, and an integer k.

    // The k-radius average for a subarray of nums centered at some index i with the
    // radius k is the average of all elements in nums between the indices i - k and
    // i + k (inclusive). If there are less than k elements before or after the
    // index i, then the k-radius average is -1.

    // Build and return an array avgs of length n where avgs[i] is the k-radius
    // average for the subarray centered at index i.

    // The average of x elements is the sum of the x elements divided by x, using
    // integer division. The integer division truncates toward zero, which means
    // losing its fractional part.

    // For example, the average of four elements 2, 3, 1, and 5 is (2 + 3 + 1 + 5) /
    // 4 = 11 / 4 = 2.75, which truncates to 2.

    // https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4836/

    public static void main(String[] args) {
        int[] nums = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int k = 3;
        int[] ans = getAverages(nums, k);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        long[] prefixSum = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (i < k || i + k >= n) {
                ans[i] = -1;
            } else {
                long sum = prefixSum[i + k + 1] - prefixSum[i - k];
                ans[i] = (int) (sum / ((k * 2) + 1));
            }
        }

        return ans;
    }
}
