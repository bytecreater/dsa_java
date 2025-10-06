public class Min_Jumps_to_reach_end {
    public static int MinJump(int[] arr){
        int n = arr.length;
        if(n <= 0){
            return -1;
        }

        int maxreach = arr[0];
        int steps = arr[0];
        int Jumps = 1;

        for (int i = 1; i < n; i++){
            if(arr[0] == 0)return -1;

            maxreach = Math.max(maxreach , i+arr[i]);

            steps--;
            
            if(steps == 0){
                Jumps++;
                if(i >= maxreach)return -1;
                steps = maxreach -i;
            }
            
        }
        return Jumps;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        int jump = MinJump(arr);
        System.out.println("The minimum jumps required are "+jump);
    }
    
}
