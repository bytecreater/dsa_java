public class conatiner_with_max_water {
    public static int FindMax(int[] height){
        int n = height.length;
        int maxwater = 0;
        int h1 = 0;
        int h2 = 1;
        while(h2 > h1){
            int volume = Math.min(height[h1],height[h2]) * (h2-h1);
            maxwater = Math.max(maxwater,volume);
            if (height[h1] < height[h2]){
                h1++;
                h2++;
            }
            else{
                h2++;
            }
            if (h2 == n){
                break;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = FindMax(height);
        System.out.println("The maximum amount of water container can hold is " + result);

    }
    
}
