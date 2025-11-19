// import java.util.HashMap;
// public class Containd_Duplicate_II {
//     public static boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int n = nums.length;
//         for(int i = 0; i < n; i++){
//             if(map.containsKey(nums[i])){
//                 if(i - map.get(nums[i]) <= k){
//                     return true;
//                 }
//                 else{
//                     // map.remove(map.get(nums[i]));
//                     map.put(nums[i],i);
//                 }
//             }
//             else{
//                 map.put(nums[i],i);
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int[] nums = {1,0,1,0,7,8};
//         System.out.println(containsNearbyDuplicate(nums,1));
//     }
// }


// Using HashSet and Window of size k

import java.util.*;

public class Containd_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If already present, duplicate found in window
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // Maintain window size k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }
}