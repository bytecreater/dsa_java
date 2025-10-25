public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int freq = 0;
        int ans = 0;
        for(int num : nums){
            if(freq == 0){
                ans = num;
            }
            if(ans == num){
                freq++;
            }
            freq--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,5,1,1,1,5,5};
        System.out.println(majorityElement(nums));
    }
    
}
