public class negative_element_one_side {
    public static void Move(int[] arr){
        int count = 0;
        for(int i =0; i < arr.length; i++){
            if (arr[i] < 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        Move(arr);
    }
}
