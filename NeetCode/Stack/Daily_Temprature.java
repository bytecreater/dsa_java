import java.util.Stack;
public class Daily_Temprature {
    public static int[] DailyTempratures(int[] temps){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[temps.length];
        for(int i = 0; i < temps.length; i++){
            while(!s.isEmpty() && temps[s.peek()] < temps[i]){
                int idx = s.pop();
                res[idx] = i - idx;
            }
            s.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] temps = {30, 38, 30, 36, 35, 40, 28};
        int ans[] = DailyTempratures(temps);   
        for(int i = 0; i < temps.length; i++){
            System.out.print(ans[i] + " ");
        } 
    }
}
