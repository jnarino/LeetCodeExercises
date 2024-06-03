public class WaysToSplitArray {

    public static void main(String[] args) {

        int[] nums = { 10, 4, -8, 7 };
        System.out.println(waysToSplitArray(nums));

    }

    public static int waysToSplitArray(int[] nums) {

        int n = nums.length - 1;
        long[] prefix = new long[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            long leftSection = prefix[i];
            long rightSection = prefix[n - 1] - prefix[i];
            if (leftSection >= rightSection) {
                ans++;
            }
        }

        return ans;

    }

}
