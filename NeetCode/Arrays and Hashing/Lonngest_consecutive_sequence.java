import java.util.HashSet;

public class Lonngest_consecutive_sequence {
    public static int LongestSequence(int[] nums){
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            int streak = 0 ,  curr = num;
            while(set.contains(curr)){
                streak++;
                curr++;
            }
            res = Math.max(streak,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        System.out.print("Length of longest conscuitive sequence : " + LongestSequence(nums));
    }
}
