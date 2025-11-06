public class Sort {
    public static int sort(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        for (int i = count; i < arr.length; i++){
            if (arr[i] == 1){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        

        System.out.println("count : " + count);
        
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,0,1,2};
        sort(arr); 
    }
    
}
