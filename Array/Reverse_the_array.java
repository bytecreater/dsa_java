// import java.util.*;
// public class Reverse_the_array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         System.out.print("Enter your array : ");
//         int n = arr.length;
//         for (int i = 0; i < n; i++ ){
//             arr[i] = sc.nextInt();
//         }
        
//         int[] temp = new int[5];
//         for (int i = 0; i < n; i++){
//             temp[i] = arr[n-i-1];
//         }

//         for (int i = 0; i < n; i++){
//             arr[i] = temp[i];
//         }

//         System.out.print("reverse array : ");
//         for(int i = n - 1; i >= 0; i--){
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }

// import java.util.*;
public class Reverse_the_array{
    public static void swap(int[] arr, int i , int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            swap(arr, left,right);
            left++;
            right--;
        }
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}    