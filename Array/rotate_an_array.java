// // Rotate an array by one place

// public class rotate_a_array {
//     public static void Rotate(int[] arr , int k){
//         for(int i = 0; i < k; i++){
//              int temp = arr[0];
//              for(int j = 0; j < arr.length - 1; j++){
//                 arr[j] = arr[j+1];
//              }
//              arr[arr.length-1] = temp;
//         }
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int k = 3;
//         Rotate(arr , k);
//     }
    
// }


// Rotate an array by kth place optimal solution

public class rotate_an_array {
    public static void Rotate(int[] arr , int k){
        int[] temp = new int[k];
        for (int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for(int i = 0; i < arr.length - k; i++){
            arr[i]=arr[k+i];
        }
        for(int i = 0; i < k; i++){
            arr[arr.length-k+i] = temp[i];
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        Rotate(arr , k);
    }   
}


