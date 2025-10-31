import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_II {
    public static List<Integer> MajorityElement(int[] nums){
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int num : nums){
            if(map.get(num) == null){
                continue;
            }
            if(map.get(num) > n/3){
                list.add(num);
            }
            map.remove(num);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {5,2,3,2,2,2,2,5,5,5};
        System.out.println(MajorityElement(nums));
    }
}
