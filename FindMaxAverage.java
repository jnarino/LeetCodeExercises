public class FindMaxAverage {

    public static void main(String[] args) {

        int[] values = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(findMaxAverage(values, k));

    }

    public static double findMaxAverage(int[] nums, int k) {

        double current = 0;
        double ans = 0;
        double tmp = 0;

        for (int i = 0; i < k; i++) {
            current += nums[i];
        }

        ans = current / k;
        System.out.println("First window value: " + ans);

        for (int i = k; i < nums.length; i++) {
            current += nums[k = i] - nums[i - k];
            System.out.println("next index: " + nums[k]);
            System.out.println("before index: " + nums[i - k]);
            tmp = current / k;
            System.out.println("Next window value: " + tmp);
            ans = Math.max(ans, tmp);

        }
        return ans;
    }

}
