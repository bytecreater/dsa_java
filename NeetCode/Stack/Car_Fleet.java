import java.util.Arrays;
import java.util.Stack;

public class Car_Fleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        float[][] cars = new float[n][2]; 

        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars , (a,b) -> Float.compare(b[0], a[0]));

        Stack<Float> s = new Stack<>();
        for(int i = 0; i < speed.length; i++){
            float time = (target - cars[i][0])/cars[i][1];
            if(s.isEmpty() || s.peek() < time){
                s.push(time);
            }
        }
        return s.size();
    }
    public static void main(String[] args) {
        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        System.out.println(carFleet(target, position, speed));
    }
    
}
