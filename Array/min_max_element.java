import java.util.*;
public class min_max_element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array : ");
        int n = 5;
        int[] elements = new int[n];
        for(int i =0; i < n; i++){
            elements[i] = sc.nextInt();
        }
        int max = elements[0];
        for (int i = 1; i < n; i++){
            if(elements[i] > max){
                max = elements[i];
            }
        }
        System.out.print("Maximum element : " + max);
        System.out.println();

        int min = elements[0];
        for (int i = 1; i < n; i++){
            if(elements[i] < min){
                min = elements[i];
            }
        }
        System.out.print("Minimum element : " + min);
        sc.close();
    }   
}
