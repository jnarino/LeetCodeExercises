public class MinStartValue {

    public static void main(String[] args) {

        int[] nums = { -3, 2, -3, 4, 2 };

        System.out.println(minStartValue(nums));

    }

    public static int minStartValue(int[] nums) {

        int total = 0;
        int temp = 0;
        for (int i : nums) {
            total += i;
            System.out.println(total);
            if (total < temp) {
                temp = total;
                System.out.println("entro " + temp);
            }
        }
        return Math.abs(temp) + 1;
    }

}
