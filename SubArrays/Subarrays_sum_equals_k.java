 public class Subarrays_sum_equals_k{
    public static void main(String[] args) {
        int[] arr = {9,4,20,3,10,5};
        int k = 33;

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum = sum + arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with sum = " + k + " is: " + count);
    }
}