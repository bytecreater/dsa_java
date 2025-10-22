public class Concatenation_of_Array {
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int ans[] = new int[2*n];
        int count = 0;
        int i = 0;
        int j = 0;
        while(count < 2){
            ans[j] = nums[i];
            i++;
            j++;
            if(i == n){
                count++;
                i = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,1,2};
        int ans[] = getConcatenation(nums);
        for(int k = 0; k < ans.length; k++){
            System.out.print(ans[k] + " ");
        }
    }
}
