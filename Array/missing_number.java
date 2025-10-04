public class missing_number {
    public static void missing(int[] arr){
        int n = arr.length;
        int m = arr[n-1];
        int maxsum = m*(m+1)/2;
        int sum = 0; 
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        int result = maxsum - sum;
        System.out.println("The missing number is : " + result);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        missing(arr);
    }
}

// public class missing_number {
//     public static int findMissing(int[] arr){
//         int n = arr.length;
//         int xor = 0;

//         // XOR 1...(n+1)
//         for(int i = 1; i <= n+1; i++){
//             xor ^= i;
//         }

//         // XOR all elements
//         for(int num : arr){
//             xor ^= num;
//         }

//         return xor;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5, 6};
//         System.out.println("The missing number is: " + findMissing(arr));
//     }
// }
 