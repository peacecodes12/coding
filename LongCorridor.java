public class LongCorridor {
    public static void main(String[] args) {
        System.out.println(numberOfWays("PP"));
    }
    public static int numberOfWays(String corridor){
        long m = 1000000007;
        int last = 0;
        int first = 0;
        long compartments = 1;
        long ways = 1;
        int ans = 1;
        int seats=0;
        int total = 0;
        for (int i = 0; i < corridor.length(); i++){
            if(corridor.charAt(i) == 'S') {
                seats++;
                total++;
                if (seats == 2)
                    first = i;

                else if (seats == 3) {
                    last = i;
                    ways = last - first;
                    compartments = (int) (((compartments % m) * (ways % m)) % m);
                    ans = (int) compartments;
                    first = 0;
                    last = 0;
                }
            }
        }
        if(seats ==1 || total < 2)
            return 0;
        return ans;
    }

}
