import java.util.HashMap;
import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[' ){
                st.push(c);
            }
            else if(map.containsValue(c)){
                if(st.isEmpty()){
                    return false;
                }
                if(c == map.get(st.peek())){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[{})]";
        System.out.println(isValid(s));
        
    }
}
