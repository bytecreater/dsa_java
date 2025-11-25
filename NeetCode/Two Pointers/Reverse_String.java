class Reverse_String {
    public static void reverseString(char[] x) {
        int n = x.length;
        int left = 0, right = n-1;
        while(left < right){
            char temp = x[left];
            x[left] = x[right];
            x[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
    public static void main(String[] args) {
        char[] s = {'n','e','e','t'};
        reverseString(s);
    }
}