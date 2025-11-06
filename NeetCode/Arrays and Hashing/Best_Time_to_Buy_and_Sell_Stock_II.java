public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static int maxProfit(int[] nums) {
        int bestbuy = nums[0];
        int maxprof = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < bestbuy){
                bestbuy = nums[i];
            }
            maxprof = maxprof+(nums[i] - bestbuy);
            bestbuy = nums[i];
        }
        return maxprof;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,1,6,4,10};
        System.out.println(maxProfit(nums));
    }
}
