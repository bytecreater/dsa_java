import java.util.Stack;

public class Queue_using_stack {
    public static class Queue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public void add(int data){
        s1.push(data);
    }

    public void remove(){
        if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int peek(){
        if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int peek =  s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return peek;
    }
}
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.remove();
        q.remove();
        q.add(5);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
