public class remove_duplicate_from_sorted_array {
    public static void remove(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        for (int k = 0; k < i+1; k++){
            System.out.print(arr[k] + " ");
            }
        System.out.println();
        int x = i + 1;
        System.out.print("length of arr is : " + x);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5,5,6};
        remove(arr);
    }
    
}
