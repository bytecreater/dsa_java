// // Brute force
// public class move_all_zeros_to_end{
//     public static void move(int[] arr){
//         int count = arr.length;
//         for(int i = 0; i < count; i++){
//             if(arr[i] == 0){
//                 count--;
//                 int temp = arr[count];
//                 arr[count]=arr[i];
//                 arr[i]=temp;
//             }
//         }
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,0,0,2,3,4,0,0,7,8}; 
//         move(arr);
//     }
// }
 
// optimal two pointer technique

public class move_all_zeros_to_end{
    public static void move(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,3,4,0,0,7,8}; 
        move(arr);
    }
}
 
