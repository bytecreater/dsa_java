import java.util.HashMap;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int temp[] = new int[10];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int first = nums[i];
            int second = target - first;
            if(map.containsKey(second)){
                temp[0] = i;
                temp[1] = map.get(second);
            }
            map.put(nums[i], i);
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;
        int[] ans = twoSum(nums,target);
        for(int i = 0; i < 2; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
