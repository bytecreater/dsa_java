public class reverse_string {
    public static void main(String[] args) {
        String name = "nihal";
        char[] x = name.toCharArray();
        int n = x.length;
        int left = 0, right = n-1;
        while(left < right){
            char temp = x[left];
            x[left] = x[right];
            x[right] = temp;
            left++;
            right--;
        }
        x.toString();
        System.out.println(x);
    }
    
}
