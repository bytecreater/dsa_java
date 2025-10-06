public class compute_xpown{
    public static int Compute(int binform , int x){
        if(binform < 0){
            binform = - binform;
            x = 1/x;
        }
        int ans = 1;
        while(binform > 0){
            if(binform % 2 == 1){
                ans = ans * x;
            }
            x = x*x;
            binform /=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        int res = Compute(n,x);
        System.out.println(res);
    }
}