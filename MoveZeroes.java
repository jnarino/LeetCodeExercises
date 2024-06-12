public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };
        System.out.println(moveZeroes(nums));
        for (int i : nums) {
            System.out.println(i);

        }
    }

    public static int[] moveZeroes(int[] nums) {

        int arrayPosition = 0;
        for (int rigthPointer = 0; rigthPointer < nums.length; rigthPointer++) {

            if (nums[rigthPointer] != 0) {
                nums[arrayPosition] = nums[rigthPointer];
                arrayPosition++;
            }

        }

        while (arrayPosition < nums.length) {
            nums[arrayPosition] = 0;
            arrayPosition++;
        }

        return nums;
    }

}
