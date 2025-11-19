import java.util.HashMap;
public class Containd_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    return true;
                }
                else{
                    // map.remove(map.get(nums[i]));
                    map.put(nums[i],i);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,7,8};
        System.out.println(containsNearbyDuplicate(nums,1));
    }
}
