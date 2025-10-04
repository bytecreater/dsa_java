public class second_smallest_element {
    public static void second_smallest(int[] arr){
        int smallest = arr[0];
        int smallest2 = 10000;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest2 = smallest;
                smallest = arr[i];
            }
            if (arr[i] > smallest && arr[i] < smallest2 ){
                smallest2 = arr[i];
            }
        }
        System.out.print("smallest : " + smallest);
        System.out.println();
        System.out.print("smallest2 : " + smallest2);
    }
    public static void main(String[] args) {
        int[] arr = {112,3,4,5,6,7};
        second_smallest(arr);
    }
    
}
