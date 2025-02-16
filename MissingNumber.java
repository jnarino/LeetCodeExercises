import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    /*
     * 268. Missing Number
     * Easy
     * 
     * Topics
     * 
     * Companies
     * Given an array nums containing n distinct numbers in the range [0, n], return
     * the only number in the range that is missing from the array.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [3,0,1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range
     * [0,3]. 2 is the missing number in the range since it does not appear in nums.
     * Example 2:
     * 
     * Input: nums = [0,1]
     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range
     * [0,2]. 2 is the missing number in the range since it does not appear in nums.
     * Example 3:
     * 
     * Input: nums = [9,6,4,2,3,5,7,0,1]
     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range
     * [0,9]. 8 is the missing number in the range since it does not appear in nums.
     * 
     * 
     * Constraints:
     * 
     * n == nums.length
     * 1 <= n <= 104
     * 0 <= nums[i] <= n
     * All the numbers of nums are unique.
     * 
     */
    public static void main(String[] args) {

        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int[] nums2 = { 0, 1 };
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(nums2));
    }

    public static int missingNumber(int[] nums) {

        Set<Integer> numbers = new HashSet<>();
        System.out.println("array size" + nums.length);

        for (int i : nums) {
            numbers.add(i);
        }

        for (int value = 0; value <= nums.length; value++) {
            if (!numbers.contains(value)) {
                return value;
            }

        }
        return -1;

    }
}
