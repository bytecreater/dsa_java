import java.util.*;
public class Reverse_the_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter your array : ");
        int n = arr.length;
        for (int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        
        int[] temp = new int[5];
        for (int i = 0; i < n; i++){
            temp[i] = arr[n-i-1];
        }

        for (int i = 0; i < n; i++){
            arr[i] = temp[i];
        }

        System.out.print("reverse array : ");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}