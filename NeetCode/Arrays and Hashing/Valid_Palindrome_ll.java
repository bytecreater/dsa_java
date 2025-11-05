public class Valid_Palindrome_ll {
    public static boolean CheckPalindrome(String s){
        int n = s.length();
        int left = 0, right = n-1;
        while(left < right){
            if(s.charAt(right) == s.charAt(left+1)){
                left++;
            }
            if(s.charAt(left) == s.charAt(right - 1)){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abxxza";
        System.out.println(CheckPalindrome(s));
    }
    
}
