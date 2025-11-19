import java.util.HashMap;
public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        char[] st = s.toCharArray();
        int i = 0;
        for(; i < s.length(); i++){
            if(map.containsKey(st[i]) && map.get(st[i]) >= left){
                left = map.get(st[i]) + 1;
            }
            maxlen = Math.max(maxlen , i - left + 1);
            map.put(st[i],i);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
