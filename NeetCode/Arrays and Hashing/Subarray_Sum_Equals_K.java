import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    public static int NoOfSums(int[] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;
        //target + sum up to i = prfixsum
        for(int num : nums){
            sum = sum + num;
            if(map.containsKey(sum - k)){
                count = count + map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,4,-2,-4,-1,-1,2,2,2,2,};
        System.out.println(NoOfSums(nums,2));
    }
}
