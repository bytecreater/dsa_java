public class Alternate_String_Merge {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder("");
        int n = Math.min(word1.length(),word2.length());
        int m = Math.max(word1.length(),word2.length());
        for(int i = 0; i < n; i++){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        for(int i = n; i < m; i++){
            if(word1.length() > word2.length()){
                s.append(word1.charAt(i));
            }
            else{
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "xyz";
        String s = mergeAlternately(word1, word2);
        System.out.println(s);
    }
    
}
