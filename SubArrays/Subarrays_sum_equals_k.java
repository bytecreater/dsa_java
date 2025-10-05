// //  brute force approach
//  public class Subarrays_sum_equals_k{
//     public static void main(String[] args) {
//         int[] arr = {9,4,20,3,10,5};
//         int k = 33;

//         int count = 0;

//         for(int i = 0; i < arr.length; i++){
//             int sum = 0;
//             for(int j = i; j < arr.length; j++){
//                 sum = sum + arr[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         System.out.println("Number of subarrays with sum = " + k + " is: " + count);
//     }
// }

// Optimal solution 
// prefixsum and unordered map
// T & S : O(n)

import java.util.HashMap;

public class Subarrays_sum_equals_k{
    public static int SubarraysWithSumK(int[] arr , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;

        for (int num : arr){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum , map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,10};
        int k = 16;
        System.out.println("Number of subarrays with sum = " + k + " is: " + SubarraysWithSumK(arr, k) );
    }
}


