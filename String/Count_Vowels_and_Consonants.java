public class Count_Vowels_and_Consonants {
    public static void main(String[] args) {
        String s = "hello world";
        int consonent = 0;
        int vowels = 0;
        String ns = s.replaceAll(" ", "");
        for(int i = 0; i < ns.length(); i++){
            char c = ns.charAt(i);
            if("aeiou".indexOf(c) != -1){
                vowels++;
            }
            else{
                consonent++;
            }
        }
        System.out.println("vowels : "+vowels+" consonents : "+consonent);
    }
}
