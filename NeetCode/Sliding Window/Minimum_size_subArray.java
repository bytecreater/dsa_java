import java.util.ArrayList;
import java.util.List;

public class Minimum_size_subArray {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - k;
        while (l < r) {
            int m = (l + r) / 2;
            if (x - arr[m] > arr[m + k] - x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = l; i < l + k; i++) {
            result.add(arr[i]);
        }

        System.out.println(result);

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,8};
        findClosestElements(arr , 2 , 6);
    }
}
