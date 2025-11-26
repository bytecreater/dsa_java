import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    ll.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                while(j < k && nums[j] == nums[j - 1]){
                        j++;
                }
                while (j < k && nums[k - 1] == nums[k]){
                    k--;
                 } 
            }
        }
        return ll;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ll = threeSum(nums);
        System.out.println(ll);
    }
}