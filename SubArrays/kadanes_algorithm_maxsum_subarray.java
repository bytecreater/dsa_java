public class kadanes_algorithm_maxsum_subarray {
    public static void main(String[] args) {
        int[] arr = {3,-4,5,-1,7,-8};
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            currsum = currsum + arr[i];
            maxsum = Math.max(maxsum,currsum);
            if(currsum < 0){
                currsum = 0;
            }
        }
        System.out.println("maximum sum of subarray is" +" " +maxsum);

    }
    
}
