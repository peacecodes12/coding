public class TestRecurssion {
    public static void main(String[] args){
        int n=4;
        print(n);
    }

    public static void print(int n){
        if(n>1)
            print(n-1);
        System.out.println(n);
        return;
    }
}
