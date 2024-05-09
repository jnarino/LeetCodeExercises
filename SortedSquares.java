import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {

        int[] nums = { -4, -1, 0, 3, 10 };

        // System.out.println((Math.abs(-4) * 4));
        // System.out.println(Math.pow(-4, 2));
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int leftSquare = nums[l] * nums[l];
            int rigthSquare = nums[r] * nums[r];

            if (leftSquare > rigthSquare) {
                result[index] = leftSquare;
                index--;
                l++;
            } else {
                result[index] = rigthSquare;
                index--;
                r--;
            }
        }
        return result;

    }
}
