import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> values = new HashMap<>();
        int tempValue = 0;

        for (int i = 0; i < nums.length; i++) {

            tempValue = target - nums[i];
            System.out.println("aca voy");
            if (values.containsKey(tempValue)) {
                System.out.println("aca voy dentro");
                return new int[] { i, values.get(tempValue) };
            }
            values.put(nums[i], i);

        }

        return new int[] { -1, -1 };

    }
}
