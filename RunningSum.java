public class RunningSum {

    public static void main(String[] args) {

    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i] + ans[i - 1];

        }
        return ans;

    }
}
