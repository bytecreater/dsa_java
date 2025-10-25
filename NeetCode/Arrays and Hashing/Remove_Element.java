    public class Remove_Element {
        public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4};
        int val = 1;
        System.out.println(removeElement(nums,val));
    }
}
