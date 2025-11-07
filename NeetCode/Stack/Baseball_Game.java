import java.util.Stack;
public class Baseball_Game {
    public static int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("+")){
                int l = s.peek();
                s.pop();
                int lf = s.peek();
                s.push(l);
                s.push(l+lf);
            }

            else if(ops[i].equals("C")){
                s.pop();
            }

            else if(ops[i].equals("D")){
                int x = s.peek();
                s.push(x*2);
            }
            else{
                int num = Integer.parseInt(ops[i]);
                s.push(num);
            }
        }
        int result = 0;
        while(!s.isEmpty()){
            result = s.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] ops = {"1","2","+","C","5","D"};
        int result = calPoints(ops);
        System.out.println(result);
    }
}
