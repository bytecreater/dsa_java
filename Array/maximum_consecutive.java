public class maximum_consecutive {
    public static void maxcons(int[] arr){
        int max = 0;
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        int result = max + 1;
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,0,0,0,0,1,0};
        maxcons(arr);
    }
    
}
