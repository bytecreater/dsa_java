// public class number_appear_once {
//     public static void number(int[] arr){
//         for(int i = 1; i < arr.length; i++){
//             if(arr[arr.length -1] != arr[arr.length-2]){
//                 System.out.println(arr[arr.length - 1]);
//                 break;
//             }
//             if(arr[1] != arr[0]){
//                 System.out.println(arr[0]);
//                 break;
//             }
//             if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,5,1,2,2,3,3,4,4};
//         number(arr);
//     }
    
// }


public class number_appear_once {
    public static void number(int[] arr){
        int result = 0;
        for(int num : arr){
            result ^= num;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4};
        number(arr);
    }
    
}
