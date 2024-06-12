public class GetCommon {
    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4 };
        System.out.println(getCommon(nums1, nums2));

    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int tempMinValue = 0;
        int pointer2 = 0;
        int ans = Integer.MAX_VALUE; ;

        for (int i = 0; i < nums1.length; i++) {
            tempMinValue = nums1[i];
           // System.out.println("cicle" + tempMinValue);
            pointer2 = 0;
            while (pointer2 < nums2.length) {
              //  System.out.println("tempValue: " + tempMinValue);
             //   System.out.println("nums2: " + nums2[pointer2]);
                if (tempMinValue == nums2[pointer2]) {
                    //System.out.println("inside");
                    ans = Math.min(tempMinValue, ans);
                    break;
                }
                pointer2++;
            }
        }
        return ans;
    }
}
