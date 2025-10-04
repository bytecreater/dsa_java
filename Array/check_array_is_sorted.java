public class check_array_is_sorted{
    public static void check(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i-1]){
            }
            else{
                System.out.print("array is unsorted");
                return;
            }
        }
        System.out.print("array is sorted");
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};
        check(arr);
    }
}