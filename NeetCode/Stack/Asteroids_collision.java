import java.util.Stack;

public class Asteroids_collision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int a : asteroids){
            boolean alive = true;
            while(!s.isEmpty() && s.peek() > 0 && a < 0){
                if(Math.abs(s.peek()) == Math.abs(a)){
                    s.pop();
                    alive = false;
                    break;
                }
                else if(Math.abs(s.peek()) < Math.abs(a)){
                    s.pop();
                }
                else{
                    alive = false;
                    break;
                }
            }
            if(alive){
                    s.push(a);
                }
        }
        int n = s.size();
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--){
            ans[i] = s.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] asteroids = {2,4,-5,-1};
        int[] ans = asteroidCollision(asteroids);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
