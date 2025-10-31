// import java.util.HashSet;

// public class Lonngest_consecutive_sequence {
//     public static int LongestSequence(int[] nums){
//         int res = 0;
//         HashSet<Integer> set = new HashSet<>();
//         for(int num : nums){
//             set.add(num);
//         }

//         for(int num : nums){
//             int streak = 0 ,  curr = num;
//             while(set.contains(curr)){
//                 streak++;
//                 curr++;
//             }
//             res = Math.max(streak,res);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int[] nums = {2,20,4,10,3,4,5};
//         System.out.print("Length of longest conscuitive sequence : " + LongestSequence(nums));
//     }
// }


import java.util.HashSet;
public class Lonngest_consecutive_sequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
         public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        System.out.print("Length of longest conscuitive sequence : " + longestConsecutive(nums));
    }
}
