public class BuyandSell_Stock {
    public static int MaxProfit(int[] arr){
        int mp = 0;
        int buy = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] < buy){
                buy = arr[i];
            }
            mp = Math.max(mp,arr[i] - buy);
        }
        return mp;
    }
    public static void main(String[] args) {
        int[] arr = {1,7,5,3,6,4,9};
        int res = MaxProfit(arr);
        System.out.println("Maximum Profit is " + res);
    }
}
