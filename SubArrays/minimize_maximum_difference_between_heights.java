import java.util.*;
public class minimize_maximum_difference_between_heights {
    public static int MinDiff(int[] arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];

        int Smallest = arr[0] + k;
        int Largest = arr[n-1] - k;

        for(int i = 0; i < n-1; i++){
            int minval = Math.min(Smallest , arr[i+1] - k);
            int maxval = Math.max(Largest , arr[i] + k);

            if(minval < 0){
                continue;
            }
            diff = Math.min(diff , maxval-minval);
        }
        return diff;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,10};
        int k = 2;
        int ans = MinDiff(arr , k);
        System.out.println("Minimum difference between maximum height is "+ ans);
    }
}
    
