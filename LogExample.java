public class LogExample {
    public static void main(String[] args) {
        int a = 2;
        int b = 22;
        int ans = power(a,b);
        System.out.println(ans);
    }

    public static int power(int a, int b){
        if(b == 0)
            return 1;
        int halfpower = power(a,b/2);
        if(b%2 == 0)
            return halfpower*halfpower;
        else return halfpower*halfpower*a;
    }
}
