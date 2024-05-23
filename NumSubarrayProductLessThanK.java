public class NumSubarrayProductLessThanK {

    public static void main(String[] args) {

        int[] nums = { 10, 5, 2, 6 };
        int k = 100;
        numSubarrayProductLessThanK(nums, k);

    }

    public static void numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0;
        int left = 0;
        int curr = 1;

        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];

            while (curr >= k) {

                curr /= nums[left];
                left++;

            }

            count+=right-left+1;

        }
        System.out.println("ending count: " + count);
    }

}
