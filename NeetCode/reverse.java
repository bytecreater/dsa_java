public class reverse {
    public static void main(String[] args) {
        String s = "Nihal Khan Deccan Tower";
        String[] arr = s.split(" ");
        for(String str : arr){
            for(int i = str.length()-1; i >= 0; i--){
                System.out.print(str.charAt(i));
            }
            System.out.print(" ");
        }
        // for(String st : arr){
        //     System.out.println(st);
        // 
    }
    
}
