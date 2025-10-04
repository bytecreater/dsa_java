public class linear_search {
    public static void search(int[] arr , int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("key found at index : " + i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        search(arr,5);
    }
}
