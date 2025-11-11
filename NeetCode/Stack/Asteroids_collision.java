import java.util.Stack;

public class Asteroids_collision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int a : asteroids){
            if(!s.isEmpty() && s.peek()*a > 0){
                s.push(a);
            }
            while(!s.isEmpty() && s.peek()*a < 0){
                if(Math.abs(s.peek()) == Math.abs(a)){
                    s.pop();
                    break;
                }
                if(Math.abs(s.peek()) < Math.abs(a)){
                    s.pop();
                }
                if(Math.abs(s.peek()) > Math.abs(a)){
                    break;
                }
            }
        }
        int[] ans = new int[s.size()];
        for(int i = 0; i < s.size(); i++){
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
