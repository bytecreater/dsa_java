public class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;   // end of nums1 valid part
        int j = n - 1;   // end of nums2
        int k = m + n - 1; // end of nums1 array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If any elements left in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {10,20,20,40,0,0};
        int m = 4;
        int[] nums2 = {1,2};
        int n = 2;
        merge(nums1, m, nums2, n);

        for (int x : nums1) System.out.print(x + " ");
    }
}
