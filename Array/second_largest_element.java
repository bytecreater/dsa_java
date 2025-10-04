public class second_largest_element {
    public static void find_2nd_largest(int[] arr){
        int max = arr[0];
        int max2 = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                // max2 = Math.max(max,max2);
                max2 = max;
                max = arr [i];
            }
            else if(arr[i] < max && arr[i] > max2){
                max2 = arr [i];
            }
        }
        System.out.print("largest : " + max);
        System.out.println();
        System.out.print("2nd largest : " + max2);
        }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,9,5,3,7,8};
        find_2nd_largest(arr);
    }
}


// Brute Force Approach
// public class nd_largest_element {
//     public static void find_2nd_largest(int[] arr){
//         int max = arr[0];
//         int max2 = -1;
//         for (int i = 1; i < arr.length; i++){
//             if (arr[i] > max){
//                 max = arr [i];
//             }
//         }
//         for (int i = 0; i < arr.length; i++){
//             if (arr[i] > max2 && arr[i] < max){
//                 max2 = arr[i];
//             }
//         }
//         System.out.print("largest : " + max);
//         System.out.println();
//         System.out.print("2nd largest : " + max2);
//         }
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,6,9,5,3,7,7,9};
//         find_2nd_largest(arr);
//     }
// }
