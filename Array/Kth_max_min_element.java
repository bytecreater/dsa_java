import java.util.Scanner;

public class Kth_max_min_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,10,4,3,20,15};
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++ ){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0 ; i < arr.length; i++){
            if(i == k){
                System.out.println("The " + k + "th minimum element is " + arr[i]);
            }
        }
        sc.close();
    }
    
}
