import java.util.Arrays;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort,tSort);
    }
    public static void main(String[] args) {
        String s = new String("raceaar");
        String t = new String("carrace");
        System.out.print(isAnagram(s, t));
    }
}
