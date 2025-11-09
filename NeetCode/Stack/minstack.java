import java.util.Stack;

public class minstack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void push(int val) {
        s.push(val);
        if(minstack.isEmpty() || val <= minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int x = s.pop();
        if(x == minstack.peek()){
            minstack.pop();
        }
        
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }

    public static void main(String[] args) {
        minstack st = new minstack();
        st.push(-100);
        st.push(-200);
        st.push(-300);
        st.push(-400);
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());
    }
    
}

