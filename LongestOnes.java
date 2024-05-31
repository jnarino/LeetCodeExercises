public class LongestOnes {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int count = 0;
        int ans = 0;
        int left = 0;

        for (int righ = 0; righ < nums.length; righ++) {
            if (nums[righ] == 0) {
                count++;
            }

            while (count > k) {
                if (nums[left] == 0) {
                    count -= 1;
                }
                left++;
            }
            ans = Math.max(ans, righ - left + 1);

        }
        return ans;
    }
}
